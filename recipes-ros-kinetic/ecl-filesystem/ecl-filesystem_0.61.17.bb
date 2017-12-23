# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Cross platform filesystem utilities (until c++11 makes its way in)."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native ecl-build ecl-config ecl-errors ecl-exceptions ecl-license"
SRC_URI = "https://github.com/yujinrobot-release/ecl_core-release/archive/release/kinetic/ecl_filesystem/0.61.17-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "f084bb3c30fd3cb01a4a33f5f6778298"
SRC_URI[sha256sum] = "19864fa5b9be4c5736a8b7f3fa1185fa29ec1606993d31e36b878cbd24f6b880"
S = "${WORKDIR}/ecl_core-release-release-kinetic-ecl_filesystem-0.61.17-0"

inherit catkin
