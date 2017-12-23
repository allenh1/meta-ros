# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "actionlib_msgs defines the common messages to interact with an      action serve"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native message-generation message-runtime std-msgs"
SRC_URI = "https://github.com/ros-gbp/common_msgs-release/archive/release/kinetic/actionlib_msgs/1.12.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "d78152d554506e920381d3d3b1bbb4c1"
SRC_URI[sha256sum] = "1a44ecf56d90426f24392c37baa3a57bf3e15c1be366165551827f93715d66bc"
S = "${WORKDIR}/common_msgs-release-release-kinetic-actionlib_msgs-1.12.5-0"

inherit catkin
