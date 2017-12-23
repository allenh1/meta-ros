# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Color codes for ansii consoles."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native ecl-build ecl-config ecl-license"
SRC_URI = "https://github.com/yujinrobot-release/ecl_lite-release/archive/release/kinetic/ecl_console/0.61.6-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "8ddec44c7a34f7a15b70407306b66f76"
SRC_URI[sha256sum] = "08bd81172e9652083d184b1332fa454187f5f0b28a072df3a04f002c3d8efd58"
S = "${WORKDIR}/ecl_lite-release-release-kinetic-ecl_console-0.61.6-0"

inherit catkin
