# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Ecl frontend to a linear matrix package (currently eigen)."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native ecl-build ecl-converters ecl-eigen ecl-exceptions ecl-formatters ecl-license ecl-math sophus"
SRC_URI = "https://github.com/yujinrobot-release/ecl_core-release/archive/release/kinetic/ecl_linear_algebra/0.61.17-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "d1d8e57dd74ca7912159ee986e16265e"
SRC_URI[sha256sum] = "5407d14c77db0b791c72e339627897af82acc33e62637afb2dcaa0f4d3241904"
S = "${WORKDIR}/ecl_core-release-release-kinetic-ecl_linear_algebra-0.61.17-0"

inherit catkin
