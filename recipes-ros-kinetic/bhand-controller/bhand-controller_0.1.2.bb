# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The bhand_controller package is intended to control the Barrett Hand"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native genmsg rospy sensor-msgs std-msgs"
SRC_URI = "https://github.com/RobotnikAutomation/barrett_hand-release/archive/release/kinetic/bhand_controller/0.1.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "e1b868d918dbc8aa629934944d346d18"
SRC_URI[sha256sum] = "9d549005a71830ddb6024662bfc5e2202f9f5ca47b0c289964e0f6c0951d1378"
S = "${WORKDIR}/barrett_hand-release-release-kinetic-bhand_controller-0.1.2-0"

inherit catkin
