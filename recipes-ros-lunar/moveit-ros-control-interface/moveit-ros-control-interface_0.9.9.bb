# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "ros_control controller manager interface for MoveIt!"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib catkin controller-manager-msgs moveit-core moveit-simple-controller-manager pluginlib trajectory-msgs"
SRC_URI = "https://github.com/ros-gbp/moveit-release/archive/release/lunar/moveit_ros_control_interface/0.9.9-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "4479ef1187a702cc5b1797bc1d6eb341"
SRC_URI[sha256sum] = "da6d43665ae9996bc2529ef812dc84d7b39e80e62b6b1e2ce71ccede29356b8d"
S = "${WORKDIR}/moveit-release-release-lunar-moveit_ros_control_interface-0.9.9-0"

inherit catkin
