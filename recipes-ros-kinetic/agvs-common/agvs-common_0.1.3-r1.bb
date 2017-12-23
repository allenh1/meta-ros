# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "URDF description of the Agvs and Agvs."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "agvs-description agvs-pad catkin-native"
SRC_URI = "https://github.com/RobotnikAutomation/agvs_common-release/archive/release/kinetic/agvs_common/0.1.3-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "888e92ef7940eb5bd64f15f4dca86acc"
SRC_URI[sha256sum] = "a6795f00e9eff8bc229652835a6ba12b715897225ecb13b80efa755148949a25"
S = "${WORKDIR}/agvs_common-release-release-kinetic-agvs_common-0.1.3-1"

inherit catkin
