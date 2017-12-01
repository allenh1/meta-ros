DEPENDS = "cmake ${PYTHON_PN}-empy-native ${PYTHON_PN}-catkin-pkg-native"

SRC_URI += "\
    file://0001-Duplicate-changes-for-newer-catkin-releases.patch \
    file://0002-Don-t-set-LD_LIBRARY_PATH-in-environment-cache.patch \
    file://0003-Don-t-use-system-env.patch \
    file://0004-Use-bin-sh.patch \
    file://0005-Add-quotes-to-generated-python-call.patch \
    file://0001-avoid-using-host-s-paths-when-cross-compiling.patch"

inherit catkin

FILES_${PN} += "\
    ${ros_datadir}/eigen/cmake \
    ${ros_datadir}/ros/cmake \
    ${ros_datadir}/.catkin \
    ${ros_prefix}/.catkin \
    ${ros_prefix}/.rosinstall \
    ${ros_prefix}/_setup_util.py \
    ${ros_prefix}/env.sh \
    ${ros_prefix}/setup.* \
    "
