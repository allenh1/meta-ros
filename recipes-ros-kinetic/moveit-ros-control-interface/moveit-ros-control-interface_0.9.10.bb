# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "ros_control controller manager interface for MoveIt!"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib catkin-native controller-manager-msgs moveit-core moveit-simple-controller-manager pluginlib trajectory-msgs"
SRC_URI = "https://github.com/ros-gbp/moveit-release/archive/release/kinetic/moveit_ros_control_interface/0.9.10-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "92b46c15a35963177252ca048d2a5ed9"
SRC_URI[sha256sum] = "c2e18cb2e5298de13b3d3416265fcc473779deb53eb2b477141f4c2b9065721f"
S = "${WORKDIR}/moveit-release-release-kinetic-moveit_ros_control_interface-0.9.10-0"

inherit catkin
