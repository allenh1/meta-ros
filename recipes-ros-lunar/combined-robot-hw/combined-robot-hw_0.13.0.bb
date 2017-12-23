# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Combined Robot HW class."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native hardware-interface pluginlib roscpp"
SRC_URI = "https://github.com/ros-gbp/ros_control-release/archive/release/lunar/combined_robot_hw/0.13.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "eb3d0dcdb2bad8ee54ff62abbb049958"
SRC_URI[sha256sum] = "f15c86522058b6c29300a0b994b07291c3c6044041dfcaaee64f797e528a2018"
S = "${WORKDIR}/ros_control-release-release-lunar-combined_robot_hw-0.13.0-0"

inherit catkin
