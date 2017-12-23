# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "visualization_msgs is a set of messages used by higher level packages, such as ,"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native geometry-msgs message-generation message-runtime std-msgs"
SRC_URI = "https://github.com/ros-gbp/common_msgs-release/archive/release/kinetic/visualization_msgs/1.12.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "2dac9a58227587bb018e3dc8e4b664bf"
SRC_URI[sha256sum] = "13efc590b2114f9ffca60292b9947716e6294a6f579d5e2237c844fcd74daeb5"
S = "${WORKDIR}/common_msgs-release-release-kinetic-visualization_msgs-1.12.5-0"

inherit catkin
