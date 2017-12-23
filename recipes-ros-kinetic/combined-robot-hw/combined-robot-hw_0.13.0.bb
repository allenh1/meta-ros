# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Combined Robot HW class."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native hardware-interface pluginlib roscpp"
SRC_URI = "https://github.com/ros-gbp/ros_control-release/archive/release/kinetic/combined_robot_hw/0.13.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "6645443923cc1b757b974d9c3b94855a"
SRC_URI[sha256sum] = "e67b499d10fb7c5745848fd7bf77737ecb9091dfd4d0ab008b4e12d9bab7e219"
S = "${WORKDIR}/ros_control-release-release-kinetic-combined_robot_hw-0.13.0-0"

inherit catkin
