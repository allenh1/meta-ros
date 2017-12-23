# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "None"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=16;endline=16;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native moveit-core moveit-ros-planning orocos-kdl pluginlib trajectory-msgs"
SRC_URI = "https://github.com/ros-industrial-release/industrial_core-release/archive/release/kinetic/industrial_trajectory_filters/0.6.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "28904da8fd6d80f3cec5c952970bdfd9"
SRC_URI[sha256sum] = "8906c3158a181acee64b9e739dc86ce4e95fff5cc0b940236752a4f6f3cd392f"
S = "${WORKDIR}/industrial_core-release-release-kinetic-industrial_trajectory_filters-0.6.0-0"

inherit catkin
