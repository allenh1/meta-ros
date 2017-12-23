# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The robotnik_msgs package. Common messages and services used by some Robotnik's "
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native message-generation message-runtime std-msgs"
SRC_URI = "https://github.com/RobotnikAutomation/robotnik_msgs-release/archive/release/kinetic/robotnik_msgs/0.2.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "981b8d768641acd854397153c2edbbbb"
SRC_URI[sha256sum] = "cbc38fa1f6170c3bb34c9bc45c5e8fff7b8f0f4042d1d67625b13baeae473803"
S = "${WORKDIR}/robotnik_msgs-release-release-kinetic-robotnik_msgs-0.2.1-0"

inherit catkin
