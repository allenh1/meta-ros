# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Provides a portable set of time functions that are especially useful for       p"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native ecl-build ecl-config ecl-errors ecl-license"
SRC_URI = "https://github.com/yujinrobot-release/ecl_lite-release/archive/release/lunar/ecl_time_lite/0.61.6-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "0597f28b2aa3a7af5395891005baf78e"
SRC_URI[sha256sum] = "fb31152a9ed784ad6853a75f83c748f404e3444c2deafc60bd97b27e5d10f96e"
S = "${WORKDIR}/ecl_lite-release-release-lunar-ecl_time_lite-0.61.6-0"

inherit catkin
