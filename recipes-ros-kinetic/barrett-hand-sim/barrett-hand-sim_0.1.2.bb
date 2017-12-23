# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The barrett_hand_sim package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "barrett-hand-control barrett-hand-gazebo catkin-native"
SRC_URI = "https://github.com/RobotnikAutomation/barrett_hand_sim-release/archive/release/kinetic/barrett_hand_sim/0.1.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "d5813675843d2a3440150d21508af0df"
SRC_URI[sha256sum] = "c955a3d5382edb3a2ca2d1c154a9514475b8b372399e58b11c8c452e25d19313"
S = "${WORKDIR}/barrett_hand_sim-release-release-kinetic-barrett_hand_sim-0.1.2-0"

inherit catkin
