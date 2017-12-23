# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "None"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native pddl-msgs pddl-planner pddl-planner-viewer task-compiler"
SRC_URI = "https://github.com/tork-a/jsk_planning-release/archive/release/kinetic/jsk_planning/0.1.10-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "6231fc85dac27307934c0ab370fc0129"
SRC_URI[sha256sum] = "5b2cfc6fa1191f7f907215a436eafa5936e5f78f4ade3001ce2cb0d27e493120"
S = "${WORKDIR}/jsk_planning-release-release-kinetic-jsk_planning-0.1.10-0"

inherit catkin
