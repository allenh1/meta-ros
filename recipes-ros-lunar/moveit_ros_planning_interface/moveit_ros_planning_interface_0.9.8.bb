# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Components of MoveIt that offer simpler interfaces to planning and execution"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=23f8de2430b349800266ded71351769e"

DEPENDS = "actionlib catkin eigen eigen_conversions moveit_ros_manipulation moveit_ros_move_group moveit_ros_planning moveit_ros_warehouse python python-catkin-pkg rosconsole roscpp rospy tf tf_conversions"
SRC_URI = "https://github.com/ros-gbp/moveit-release/archive/release/lunar/moveit_ros_planning_interface/0.9.8-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "4d253e48fd8ffe447ad03c9e6601fc52"
SRC_URI[sha256sum] = "afceb9a06597708ba041c70b9c4942ecb41dc5054c48bd795aae15c3f37e909e"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
