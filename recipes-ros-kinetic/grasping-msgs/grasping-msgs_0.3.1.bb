# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Messages for describing objects and how to grasp them."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib catkin-native geometry-msgs message-generation message-runtime moveit-msgs sensor-msgs shape-msgs"
SRC_URI = "https://github.com/mikeferguson/grasping_msgs-gbp/archive/release/kinetic/grasping_msgs/0.3.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "6dd1f7e0591ceb6b2554b6ce1982c6f1"
SRC_URI[sha256sum] = "afc0af83897f468ecf723597704aaebb582ce330d818ff073b397051c328aa46"
S = "${WORKDIR}/grasping_msgs-gbp-release-kinetic-grasping_msgs-0.3.1-0"

inherit catkin
