# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The teleop_tools_msgs package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib-msgs catkin-native control-msgs message-generation message-runtime"
SRC_URI = "https://github.com/ros-gbp/teleop_tools-release/archive/release/kinetic/teleop_tools_msgs/0.2.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "c2a49a8606cc9013937679c7685e0faa"
SRC_URI[sha256sum] = "db8cb8ff3dc5552667b70ca4c7d1ee838419bc6226951875beeaa23990a8e7e2"
S = "${WORKDIR}/teleop_tools-release-release-kinetic-teleop_tools_msgs-0.2.5-0"

inherit catkin
