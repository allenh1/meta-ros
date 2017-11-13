# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The abseil_cpp package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "Apache"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=211ba54883815de9f52a3dcd9f281523"

DEPENDS = "catkin-native"
SRC_URI = "https://github.com/Eurecat/abseil_cpp-release/archive/release/lunar/abseil_cpp/0.1.4-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "8df0d6ec0f93feb37e66298e2d4e61e2"
SRC_URI[sha256sum] = "2db1cf7f53adddc7809525d553e57beb2c0dd836c1c90fa60e47da419fdfd4e4"
S = "${WORKDIR}/abseil_cpp-release-release-lunar-abseil_cpp-0.1.4-0"

inherit catkin
