# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The rbcar_control package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native robot-state-publisher"
SRC_URI = "https://github.com/RobotnikAutomation/rbcar_sim-release/archive/release/kinetic/rbcar_control/1.0.4-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "5a73e45c48806fb721df7146be2f935d"
SRC_URI[sha256sum] = "e217c86778fdb66afbda9fd48792ddb5271ea57e59e1a6bdcd9583753089893c"
S = "${WORKDIR}/rbcar_sim-release-release-kinetic-rbcar_control-1.0.4-1"

inherit catkin
