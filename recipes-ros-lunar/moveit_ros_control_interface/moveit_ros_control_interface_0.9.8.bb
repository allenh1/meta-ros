# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "None"
AUTHOR = "OSRF"
SECTION = "devel"
LIC_FILES_CHKSUM = file://package.xml;beginline=11;endline=11;md5=23f8de2430b349800266ded71351769e"

DEPENDS = "actionlib catkin controller_manager_msgs moveit_core moveit_simple_controller_manager pluginlib trajectory_msgs"
SRC_URI = "https://github.com/ros-gbp/moveit-release/archive/release/lunar/moveit_ros_control_interface/0.9.8-0.tar.gz";downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "e8cbe9c2865bfac11c54461826f89275"
SRC_URI[sha256sum] = "b6f7c73c4844284ecc59f85195157a335f83c6cdb538e40c7d7deedb597218fd"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
