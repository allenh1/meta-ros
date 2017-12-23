# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Specialization of message_relay for tf2"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native message-relay roscpp tf tf2-msgs tf2-ros"
SRC_URI = "https://github.com/clearpath-gbp/cpr_multimaster_tools-release/archive/release/kinetic/tf2_relay/0.0.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "1189a84163e84174cd7f867f5943ad19"
SRC_URI[sha256sum] = "48c2b0d027b701f271a12c6bb3782496187639e331fccb4d7ba8c615d7fe76b0"
S = "${WORKDIR}/cpr_multimaster_tools-release-release-kinetic-tf2_relay-0.0.1-0"

inherit catkin
