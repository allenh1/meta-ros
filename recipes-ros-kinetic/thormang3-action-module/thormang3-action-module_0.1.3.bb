# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package is a motion module that can play the saved action.     This module "
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native robotis-controller-msgs robotis-framework-common roscpp std-msgs thormang3-action-module-msgs"
SRC_URI = "https://github.com/ROBOTIS-GIT-release/ROBOTIS-THORMANG-MPC-release/archive/release/kinetic/thormang3_action_module/0.1.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "6d78283c6120897a56d6ff8dc77cbf6f"
SRC_URI[sha256sum] = "c1e847c2be11c10d629722ba45239e835921127d953f9af0ed9a2b16b27d0806"
S = "${WORKDIR}/ROBOTIS-THORMANG-MPC-release-release-kinetic-thormang3_action_module-0.1.3-0"

inherit catkin
