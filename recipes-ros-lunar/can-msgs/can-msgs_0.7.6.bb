# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "CAN related message types."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native catkin message-generation message-runtime std-msgs"
SRC_URI = "https://github.com/ros-industrial-release/ros_canopen-release/archive/release/lunar/can_msgs/0.7.6-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "61963ce3b29ff30aee2cd96db1160a82"
SRC_URI[sha256sum] = "f6eb72d76714d621c47d16a7d5f106a4b3df176405be9b8bd6428b74d9f57a30"
S = "${WORKDIR}/ros_canopen-release-release-lunar-can_msgs-0.7.6-0"

inherit catkin
