# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Resources used for MoveIt! testing"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native joint-state-publisher robot-state-publisher"
SRC_URI = "https://github.com/ros-gbp/moveit_resources-release/archive/release/lunar/moveit_resources/0.6.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "8c038b0dfa66d9b565f42cbff040709c"
SRC_URI[sha256sum] = "59354ec025a6fc0eaf1c4f6b2bf68dcec0265abe67bc723d94233b65579d4078"
S = "${WORKDIR}/moveit_resources-release-release-lunar-moveit_resources-0.6.2-0"

inherit catkin
