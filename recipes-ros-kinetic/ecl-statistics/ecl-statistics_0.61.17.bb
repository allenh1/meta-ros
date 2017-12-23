# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Common statistical structures and algorithms for control systems."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native ecl-build ecl-config ecl-license ecl-linear-algebra ecl-mpl ecl-type-traits"
SRC_URI = "https://github.com/yujinrobot-release/ecl_core-release/archive/release/kinetic/ecl_statistics/0.61.17-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "f1a00f7eb5ebd80eee065cdebb9df878"
SRC_URI[sha256sum] = "9f35e828c2c62e86e373448a88b9ee6cbba38eeb3d8d364c2b0929c6abd81e26"
S = "${WORKDIR}/ecl_core-release-release-kinetic-ecl_statistics-0.61.17-0"

inherit catkin
