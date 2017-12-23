# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The thormang3_manipulation_demo package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native robotis-controller-msgs roscpp std-msgs thormang3-manipulation-module-msgs"
SRC_URI = "https://github.com/ROBOTIS-GIT-release/ROBOTIS-THORMANG-PPC-release/archive/release/kinetic/thormang3_manipulation_demo/0.1.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "307be2c0f34a1d25397002ea23530cf6"
SRC_URI[sha256sum] = "faba264b890456dd6b3e78781698d4a2af51ba6c33c2a3f0fe1d3367108a8563"
S = "${WORKDIR}/ROBOTIS-THORMANG-PPC-release-release-kinetic-thormang3_manipulation_demo-0.1.2-0"

inherit catkin
