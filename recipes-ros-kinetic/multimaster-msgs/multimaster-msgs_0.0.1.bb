# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The multimaster_msgs package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native message-generation message-runtime std-msgs"
SRC_URI = "https://github.com/clearpath-gbp/cpr_multimaster_tools-release/archive/release/kinetic/multimaster_msgs/0.0.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "c1b34509cf6d3275f8668fe0393d0aba"
SRC_URI[sha256sum] = "1015e0cb0f8d50c9310d1f6ebfc54aaa8ede924c80bc7829328e6ddc0c573aae"
S = "${WORKDIR}/cpr_multimaster_tools-release-release-kinetic-multimaster_msgs-0.0.1-0"

inherit catkin
