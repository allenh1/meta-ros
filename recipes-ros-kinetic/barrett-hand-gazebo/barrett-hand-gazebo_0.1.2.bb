# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The barrett_hand_gazebo package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "barrett-hand-description catkin-native gazebo-ros roscpp"
SRC_URI = "https://github.com/RobotnikAutomation/barrett_hand_sim-release/archive/release/kinetic/barrett_hand_gazebo/0.1.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "dfccd1f5db59c1603500ec64d7ff26d1"
SRC_URI[sha256sum] = "4b52a48be7bfa7afcf77fc35dcea6980f408094bc4163205fa6168ff51ced16c"
S = "${WORKDIR}/barrett_hand_sim-release-release-kinetic-barrett_hand_gazebo-0.1.2-0"

inherit catkin
