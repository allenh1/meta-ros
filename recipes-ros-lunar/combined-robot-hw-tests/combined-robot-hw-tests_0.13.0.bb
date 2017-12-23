# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The combined_robot_hw_tests package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native combined-robot-hw controller-manager controller-manager-tests hardware-interface roscpp"
SRC_URI = "https://github.com/ros-gbp/ros_control-release/archive/release/lunar/combined_robot_hw_tests/0.13.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "f2d4d71f04125726f3d7f5b487d19c1b"
SRC_URI[sha256sum] = "d59b0073915d36c72c329b189db4b6583085f162845dc869e3868ae61ada2350"
S = "${WORKDIR}/ros_control-release-release-lunar-combined_robot_hw_tests-0.13.0-0"

inherit catkin
