# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Specialization of message_relay for clock"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native message-relay roscpp rosgraph-msgs"
SRC_URI = "https://github.com/clearpath-gbp/cpr_multimaster_tools-release/archive/release/kinetic/clock_relay/0.0.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "d2ed564f349ccab8e753417e1259b5a4"
SRC_URI[sha256sum] = "4fc68bffec25eb3c8e0b9c60bea8ad10c71a9abb2e784c8e2ad6404014218d0e"
S = "${WORKDIR}/cpr_multimaster_tools-release-release-kinetic-clock_relay-0.0.1-0"

inherit catkin
