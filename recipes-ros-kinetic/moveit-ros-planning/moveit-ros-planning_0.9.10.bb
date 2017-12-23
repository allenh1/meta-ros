# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Planning components of MoveIt that use ROS"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib angles catkin-native dynamic-reconfigure eigen moveit-core moveit-ros-perception pluginlib"
SRC_URI = "https://github.com/ros-gbp/moveit-release/archive/release/kinetic/moveit_ros_planning/0.9.10-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "51fabcfd841f435b98e172c541c32113"
SRC_URI[sha256sum] = "08672e0f48f9eb83a5b1cc5d1bfc862000964856e53e048e6dfb8d6dae8cd7ea"
S = "${WORKDIR}/moveit-release-release-kinetic-moveit_ros_planning-0.9.10-0"

inherit catkin
