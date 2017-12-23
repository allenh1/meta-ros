# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The barrett_hand package contains all the components to control the Barrett Hand"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "bhand-controller catkin-native rqt-bhand"
SRC_URI = "https://github.com/RobotnikAutomation/barrett_hand-release/archive/release/kinetic/barrett_hand/0.1.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "47383c1d118c753e9563635d671f4b6b"
SRC_URI[sha256sum] = "ef33e29fad5ff452ce1315dae181e2ffeb417d1e0d66452a29a40d9f0edc2ad8"
S = "${WORKDIR}/barrett_hand-release-release-kinetic-barrett_hand-0.1.2-0"

inherit catkin
