# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Provides a portable set of time functions that are especially useful for       p"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native ecl-build ecl-config ecl-errors ecl-license"
SRC_URI = "https://github.com/yujinrobot-release/ecl_lite-release/archive/release/kinetic/ecl_time_lite/0.61.6-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "b7ee8c35d23d73fe4c98d09f89e6a9cb"
SRC_URI[sha256sum] = "5990b1818fb3cc2d7921fde37ddbe0ec0ebcea00c279d82c5d79b4723f7ddba9"
S = "${WORKDIR}/ecl_lite-release-release-kinetic-ecl_time_lite-0.61.6-0"

inherit catkin
