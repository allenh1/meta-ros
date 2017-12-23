# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "An example controller manager plugin for MoveIt. This is not functional code."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native moveit-core pluginlib roscpp"
SRC_URI = "https://github.com/ros-gbp/moveit-release/archive/release/kinetic/moveit_controller_manager_example/0.9.10-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "a0cc4ac99560bf16d154dca2ef486e30"
SRC_URI[sha256sum] = "2451d8079f3d94862f7cc75492e7359cf37d5819c87af02a9a5abdc17fb701cd"
S = "${WORKDIR}/moveit-release-release-kinetic-moveit_controller_manager_example-0.9.10-0"

inherit catkin
