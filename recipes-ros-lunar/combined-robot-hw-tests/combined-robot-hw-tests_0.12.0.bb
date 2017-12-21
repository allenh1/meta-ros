# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The combined_robot_hw_tests package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native combined-robot-hw controller-manager controller-manager-tests hardware-interface roscpp"
SRC_URI = "https://github.com/ros-gbp/ros_control-release/archive/release/lunar/combined_robot_hw_tests/0.12.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "4afc1d43af124c68df6d80e8448b8688"
SRC_URI[sha256sum] = "208d5a1326e9df292dae7dafa3520b218ac05c7acb1ee54a785fc74f1263c59f"
S = "${WORKDIR}/ros_control-release-release-lunar-combined_robot_hw_tests-0.12.0-0"

inherit catkin
