# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "agvs Gazebo simulation packages"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "agvs-control agvs-gazebo agvs-robot-control agvs-sim-bringup catkin-native"
SRC_URI = "https://github.com/RobotnikAutomation/agvs_sim-release/archive/release/kinetic/agvs_sim/0.1.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "a9a8e4240375fefb9af08e0b8b739418"
SRC_URI[sha256sum] = "a189047dc877a521a3201c2b70ec3e5db2aa6d6bba1b8896a0b5aeb8922ff360"
S = "${WORKDIR}/agvs_sim-release-release-kinetic-agvs_sim-0.1.3-0"

inherit catkin
