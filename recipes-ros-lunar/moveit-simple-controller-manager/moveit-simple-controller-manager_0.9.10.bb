# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A generic, simple controller manager plugin for MoveIt."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib catkin-native catkin control-msgs moveit-core pluginlib roscpp"
SRC_URI = "https://github.com/ros-gbp/moveit-release/archive/release/lunar/moveit_simple_controller_manager/0.9.10-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "d28b1ea497353fc0aa0869ddc0cbc276"
SRC_URI[sha256sum] = "bcb368e79dc83506590bf56e01cd1da1292f6e75a8f11dd75fece1d64980b050"
S = "${WORKDIR}/moveit-release-release-lunar-moveit_simple_controller_manager-0.9.10-0"

inherit catkin
