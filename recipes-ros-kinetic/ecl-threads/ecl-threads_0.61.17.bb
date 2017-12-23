# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package provides the c++ extensions for a variety of threaded       program"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native ecl-build ecl-concepts ecl-config ecl-errors ecl-exceptions ecl-license ecl-time ecl-utilities"
SRC_URI = "https://github.com/yujinrobot-release/ecl_core-release/archive/release/kinetic/ecl_threads/0.61.17-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "f86867adf3ae02bc881b3232f2a783bc"
SRC_URI[sha256sum] = "93443ed61cd42a7d9e86d0fde1708b004c3bce432972f020d77f093b0795f3b9"
S = "${WORKDIR}/ecl_core-release-release-kinetic-ecl_threads-0.61.17-0"

inherit catkin
