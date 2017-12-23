# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Messages used by the gateway model."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=5ee5b8b046ae48ad94a2037ca953a67b"

DEPENDS = "catkin-native message-generation message-runtime std-msgs"
SRC_URI = "https://github.com/yujinrobot-release/rocon_msgs-release/archive/release/kinetic/gateway_msgs/0.9.0-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "1d06a416c7682f858686debaa8765bbb"
SRC_URI[sha256sum] = "4959e3047940b5ea5b3219209993dc31685c3750c86336bad04c63518ea0d21d"
S = "${WORKDIR}/rocon_msgs-release-release-kinetic-gateway_msgs-0.9.0-1"

inherit catkin
