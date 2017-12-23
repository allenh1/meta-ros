# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Combined Robot HW class."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native catkin hardware-interface pluginlib roscpp"
SRC_URI = "https://github.com/ros-gbp/ros_control-release/archive/release/lunar/combined_robot_hw/0.12.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "37bc9ab3065f1c765ad0041a1d54832c"
SRC_URI[sha256sum] = "92a6af33d681b336ab6d1602076667ebd67dd46f45895601aa52382672266357"
S = "${WORKDIR}/ros_control-release-release-lunar-combined_robot_hw-0.12.0-0"

inherit catkin
