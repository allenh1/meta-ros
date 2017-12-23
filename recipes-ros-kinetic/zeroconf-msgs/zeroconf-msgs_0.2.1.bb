# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "General ros communications used by the various zeroconf implementations."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=5ee5b8b046ae48ad94a2037ca953a67b"

DEPENDS = "catkin-native message-generation message-runtime std-msgs"
SRC_URI = "https://github.com/yujinrobot-release/zeroconf_msgs-release/archive/release/kinetic/zeroconf_msgs/0.2.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "c18552a9d14efb171b5e3ff1dcbf9694"
SRC_URI[sha256sum] = "2cb5de5b8b7320b0b3f931b56368ca120eea3627d6781994373c51d321e6786b"
S = "${WORKDIR}/zeroconf_msgs-release-release-kinetic-zeroconf_msgs-0.2.1-0"

inherit catkin
