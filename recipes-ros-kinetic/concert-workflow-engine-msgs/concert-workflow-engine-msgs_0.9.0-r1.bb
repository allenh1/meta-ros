# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Messages used by workflow engine"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=5ee5b8b046ae48ad94a2037ca953a67b"

DEPENDS = "catkin-native message-generation message-runtime std-msgs"
SRC_URI = "https://github.com/yujinrobot-release/rocon_msgs-release/archive/release/kinetic/concert_workflow_engine_msgs/0.9.0-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "fe4709b8592bff6643f0dbc99752e9d8"
SRC_URI[sha256sum] = "601e6f5dff3ab0b715aa5adb87c5a14de6e91fd9df39f82671b50ac98e1a8bb4"
S = "${WORKDIR}/rocon_msgs-release-release-kinetic-concert_workflow_engine_msgs-0.9.0-1"

inherit catkin
