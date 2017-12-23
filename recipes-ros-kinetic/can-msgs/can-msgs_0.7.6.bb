# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "CAN related message types."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native message-generation message-runtime std-msgs"
SRC_URI = "https://github.com/ros-industrial-release/ros_canopen-release/archive/release/kinetic/can_msgs/0.7.6-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "5b3204f3558c132a73fde2f4c4f14c20"
SRC_URI[sha256sum] = "86b5d5479455bd3d30ceed92ecabf3acf257d9a473982abcc8cf215e85c9100c"
S = "${WORKDIR}/ros_canopen-release-release-kinetic-can_msgs-0.7.6-0"

inherit catkin
