# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Planning components of MoveIt that use ROS"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib angles catkin-native dynamic-reconfigure eigen moveit-core moveit-ros-perception pluginlib"
SRC_URI = "https://github.com/ros-gbp/moveit-release/archive/release/lunar/moveit_ros_planning/0.9.8-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "4aa139cb1d1ca0b28699a4d6732768c6"
SRC_URI[sha256sum] = "cfe28f6b87238ab0d79fce2392f1d8aa472cbe2eb45a09a54f1a3f253eb81f38"
S = "${WORKDIR}/moveit-release-release-lunar-moveit_ros_planning-0.9.8-0"

inherit catkin
