# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Components of MoveIt that offer simpler interfaces to planning and execution"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib catkin-native eigen eigen-conversions moveit-ros-manipulation moveit-ros-move-group moveit-ros-planning moveit-ros-warehouse python python-catkin-pkg-native rosconsole roscpp rospy tf tf-conversions"
SRC_URI = "https://github.com/ros-gbp/moveit-release/archive/release/lunar/moveit_ros_planning_interface/0.9.8-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "4d253e48fd8ffe447ad03c9e6601fc52"
SRC_URI[sha256sum] = "afceb9a06597708ba041c70b9c4942ecb41dc5054c48bd795aae15c3f37e909e"
S = "${WORKDIR}/moveit-release-release-lunar-moveit_ros_planning_interface-0.9.8-0"

inherit catkin
