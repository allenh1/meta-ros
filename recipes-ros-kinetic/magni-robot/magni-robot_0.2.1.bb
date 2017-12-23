# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The magni_robot package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native magni-bringup magni-demos magni-description magni-nav magni-teleop"
SRC_URI = "https://github.com/UbiquityRobotics-release/magni_robot-release/archive/release/kinetic/magni_robot/0.2.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "9c5e407578b7ebce4b73f6600ff63ccf"
SRC_URI[sha256sum] = "5c589f4b6f2a4cc4693c89f970181386410587f5393d520601ef25795a15fd97"
S = "${WORKDIR}/magni_robot-release-release-kinetic-magni_robot-0.2.1-0"

inherit catkin
