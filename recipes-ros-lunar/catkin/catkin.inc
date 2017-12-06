DEPENDS = "cmake ${PYTHON_PN}-empy-native ${PYTHON_PN}-catkin-pkg-native"

SRC_URI += "\
    file://0001-Duplicate-changes-for-newer-catkin-releases.patch \
    file://0001-avoid-using-host-s-paths-when-cross-compiling.patch"

inherit catkin

# FILES_${PN} += "\
#     ${ros_datadir}/eigen/cmake \
#     ${ros_datadir}/ros/cmake \
#     ${ros_datadir}/.catkin \
#     ${ros_prefix}/.catkin \
#     ${ros_prefix}/.rosinstall \
#     ${ros_prefix}/_setup_util.py \
#     ${ros_prefix}/env.sh \
#     ${ros_prefix}/setup.* \
#     "
