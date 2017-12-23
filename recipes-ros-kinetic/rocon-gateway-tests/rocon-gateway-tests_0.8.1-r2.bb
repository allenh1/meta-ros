# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Testing programs for gateways."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native rocon-test"
SRC_URI = "https://github.com/yujinrobot-release/rocon_multimaster-release/archive/release/kinetic/rocon_gateway_tests/0.8.1-2.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "b8abf2175798a22f9dece3a81fc9a86d"
SRC_URI[sha256sum] = "e17b06ec913198b9b3f81603f8e74c211040f00ea7cb6a78d4ac87f0b342acd5"
S = "${WORKDIR}/rocon_multimaster-release-release-kinetic-rocon_gateway_tests-0.8.1-2"

inherit catkin
