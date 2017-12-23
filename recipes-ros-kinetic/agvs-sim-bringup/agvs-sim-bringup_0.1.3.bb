# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The agvs_sim_bringup package. It contains multiple launch files to perform diffe"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native"
SRC_URI = "https://github.com/RobotnikAutomation/agvs_sim-release/archive/release/kinetic/agvs_sim_bringup/0.1.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "f38718910b82180f58ecfa83241a5bc8"
SRC_URI[sha256sum] = "6fd81a5a036fbc9c6c05d60140b3c552f567539adb8f7d3dc0646ee430066611"
S = "${WORKDIR}/agvs_sim-release-release-kinetic-agvs_sim_bringup-0.1.3-0"

inherit catkin
