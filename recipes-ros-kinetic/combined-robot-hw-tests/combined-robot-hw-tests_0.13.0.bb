# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The combined_robot_hw_tests package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native combined-robot-hw controller-manager controller-manager-tests hardware-interface roscpp"
SRC_URI = "https://github.com/ros-gbp/ros_control-release/archive/release/kinetic/combined_robot_hw_tests/0.13.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "180e654ea97bc87ee62381a20dd431d9"
SRC_URI[sha256sum] = "53b82221f4d32585f6170a6b5f1b2139523c0b70d4f88d120d8e10cde10a952f"
S = "${WORKDIR}/ros_control-release-release-kinetic-combined_robot_hw_tests-0.13.0-0"

inherit catkin
