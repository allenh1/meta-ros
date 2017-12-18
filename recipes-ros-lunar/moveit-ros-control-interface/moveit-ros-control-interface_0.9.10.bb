# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "ros_control controller manager interface for MoveIt!"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib catkin-native catkin controller-manager-msgs moveit-core moveit-simple-controller-manager pluginlib trajectory-msgs"
SRC_URI = "https://github.com/ros-gbp/moveit-release/archive/release/lunar/moveit_ros_control_interface/0.9.10-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "cd0d3833e217bedbd1b244c95344d79d"
SRC_URI[sha256sum] = "861d03adda7373661b1284d49b6073903377b1109a873d8a6e897a92bbf9d61b"
S = "${WORKDIR}/moveit-release-release-lunar-moveit_ros_control_interface-0.9.10-0"

inherit catkin
