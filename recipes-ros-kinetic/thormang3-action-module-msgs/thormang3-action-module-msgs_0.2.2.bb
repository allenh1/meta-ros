# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package is a set of messages and services for using thormang3_action_module"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native message-generation message-runtime std-msgs"
SRC_URI = "https://github.com/ROBOTIS-GIT-release/ROBOTIS-THORMANG-msgs-release/archive/release/kinetic/thormang3_action_module_msgs/0.2.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "08e4d9279d32816116f6c4fdf143a57f"
SRC_URI[sha256sum] = "d8c9d919879efbdaa911aa0de4800e01f483526679c1daf4d845fdbbd58c692e"
S = "${WORKDIR}/ROBOTIS-THORMANG-msgs-release-release-kinetic-thormang3_action_module_msgs-0.2.2-0"

inherit catkin
