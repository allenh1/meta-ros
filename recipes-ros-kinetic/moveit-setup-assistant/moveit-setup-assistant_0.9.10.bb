# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Generates a configuration package that makes it easy to use MoveIt!"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native moveit-core moveit-ros-planning moveit-ros-visualization srdfdom xacro yaml-cpp"
SRC_URI = "https://github.com/ros-gbp/moveit-release/archive/release/kinetic/moveit_setup_assistant/0.9.10-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "785cbfe41eb79bd6c9eca038a7df223e"
SRC_URI[sha256sum] = "eea41d7ba94619d2a53e1b6d5c091c806502b48b82a2d0c817a4d30973d233e6"
S = "${WORKDIR}/moveit-release-release-kinetic-moveit_setup_assistant-0.9.10-0"

inherit catkin
