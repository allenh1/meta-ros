# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The barrett_hand_description package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native"
SRC_URI = "https://github.com/RobotnikAutomation/barrett_hand_common-release/archive/release/kinetic/barrett_hand_description/0.1.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "ae2936887254bb996c988a86ee9cbf02"
SRC_URI[sha256sum] = "21da44900cd52d4e3a5e343549b6d8cf3ebd797d42f332b3eddc0107dc472bc9"
S = "${WORKDIR}/barrett_hand_common-release-release-kinetic-barrett_hand_description-0.1.2-0"

inherit catkin
