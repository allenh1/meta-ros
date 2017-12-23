# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "nav_msgs defines the common messages used to interact with the      stack."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib-msgs catkin-native catkin geometry-msgs message-generation message-runtime std-msgs"
SRC_URI = "https://github.com/ros-gbp/common_msgs-release/archive/release/lunar/nav_msgs/1.12.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "f6761f9b00f317d681d5fb04d52acc0b"
SRC_URI[sha256sum] = "d4ff96f38b5ac3a6c795342bb9b3658f2f8c9baa005ed8f179ccf0a2c55afc26"
S = "${WORKDIR}/common_msgs-release-release-lunar-nav_msgs-1.12.5-0"

inherit catkin
