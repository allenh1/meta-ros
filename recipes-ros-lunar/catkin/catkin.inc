DEPENDS = "cmake ${PYTHON_PN}-empy-native ${PYTHON_PN}-catkin-pkg-native"

SRC_URI += "\
    file://0001-CATKIN_WORKSPACES-Don-t-require-.catkin-file.patch \
    file://0001-use-python-provided-by-environment-instead-of-the-ge.patch \
    file://0001-avoid-using-host-s-paths-when-cross-compiling.patch \
    file://0001-relocate-dependency-s-headers-to-current-sysroot.patch \
    ${@'file://0001-python.cmake-look-for-python3-first.patch' if d.getVar('PYTHON_PN', True) == 'python3' else ''} \
    "

inherit catkin

FILES_${PN}-dev += "\
    ${ros_datadir}/eigen/cmake \
    ${ros_datadir}/ros/cmake \
    ${ros_datadir}/.catkin \
    ${ros_prefix}/.catkin \
    ${ros_prefix}/.rosinstall \
    ${ros_prefix}/_setup_util.py \
    ${ros_prefix}/env.sh \
    ${ros_prefix}/setup.* \
    "

