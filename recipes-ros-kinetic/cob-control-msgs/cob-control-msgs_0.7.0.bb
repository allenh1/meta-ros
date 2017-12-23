# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Common messages and services used in various packages within cob_control."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "LGPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=46ee8693f40a89a31023e97ae17ecf19"

DEPENDS = "catkin-native geometry-msgs message-generation message-runtime std-msgs"
SRC_URI = "https://github.com/ipa320/cob_control-release/archive/release/kinetic/cob_control_msgs/0.7.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "62eb1b2e129c2ff72e1e14692c03e02a"
SRC_URI[sha256sum] = "a862b452ffc50357826732f7162b5713ac1f73d6813759446e45123ee9aa2ab9"
S = "${WORKDIR}/cob_control-release-release-kinetic-cob_control_msgs-0.7.0-0"

inherit catkin
