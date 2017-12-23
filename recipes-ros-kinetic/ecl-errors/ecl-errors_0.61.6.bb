# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This library provides lean and mean error mechanisms.      It includes c style e"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native ecl-config ecl-license"
SRC_URI = "https://github.com/yujinrobot-release/ecl_lite-release/archive/release/kinetic/ecl_errors/0.61.6-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "7078b207e3b6c42762e5a0001fd1a1e8"
SRC_URI[sha256sum] = "359b4f40b84ab9145b0601c720b71216c67bc5505f449344b02f52ce7301aeb9"
S = "${WORKDIR}/ecl_lite-release-release-kinetic-ecl_errors-0.61.6-0"

inherit catkin
