# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Components of MoveIt that offer simpler interfaces to planning and execution"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib catkin-native eigen eigen-conversions moveit-ros-manipulation moveit-ros-move-group moveit-ros-planning moveit-ros-warehouse python python-catkin-pkg-native rosconsole roscpp rospy tf tf-conversions"
SRC_URI = "https://github.com/ros-gbp/moveit-release/archive/release/lunar/moveit_ros_planning_interface/0.9.10-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "3b6753b3128604137b3296f3becb21ee"
SRC_URI[sha256sum] = "ece085a99905588b4e3f9a1c74165bd2ef6fbfa13bb180f7cbefe5233f6e7125"
S = "${WORKDIR}/moveit-release-release-lunar-moveit_ros_planning_interface-0.9.10-0"

inherit catkin
