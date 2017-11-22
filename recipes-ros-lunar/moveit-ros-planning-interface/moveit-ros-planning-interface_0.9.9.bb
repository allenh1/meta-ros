# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Components of MoveIt that offer simpler interfaces to planning and execution"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib catkin eigen eigen-conversions moveit-ros-manipulation moveit-ros-move-group moveit-ros-planning moveit-ros-warehouse python python-catkin-pkg rosconsole roscpp rospy tf tf-conversions"
SRC_URI = "https://github.com/ros-gbp/moveit-release/archive/release/lunar/moveit_ros_planning_interface/0.9.9-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "1ca700ad157fc4e6609547a68f23bdcf"
SRC_URI[sha256sum] = "6ce68d6e3eb176a11f8ebcffbbf72dc56ea7a64cfbe93520bc76d49319fd33aa"
S = "${WORKDIR}/moveit-release-release-lunar-moveit_ros_planning_interface-0.9.9-0"

inherit catkin
