# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The barrett_hand_control package is intended to control the gazebo simulation of"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native"
SRC_URI = "https://github.com/RobotnikAutomation/barrett_hand_sim-release/archive/release/kinetic/barrett_hand_control/0.1.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "6ca9d44b96d650e55ccf7d5f87cbfc8f"
SRC_URI[sha256sum] = "bd38c3e79981551697d1a5688f3187e3b83afbc9531f8530acdff9e98e97ab7d"
S = "${WORKDIR}/barrett_hand_sim-release-release-kinetic-barrett_hand_control-0.1.2-0"

inherit catkin
