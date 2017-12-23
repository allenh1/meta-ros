# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "DrRobot's Jaguar 4X4 controller configurations"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native controller-manager diff-drive-controller joint-state-controller joint-trajectory-controller joy robot-localization roslaunch rostopic teleop-twist-joy twist-mux"
SRC_URI = "https://github.com/gstavrinos/jaguar-release/archive/release/kinetic/jaguar_control/0.1.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "3e36a2106b61968db46275bdb918c09a"
SRC_URI[sha256sum] = "cd8f8e78719d5963b7f4518b9c5f5beaf5477f981e1a48657189b1e3314f8881"
S = "${WORKDIR}/jaguar-release-release-kinetic-jaguar_control-0.1.0-0"

inherit catkin
