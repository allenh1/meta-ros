# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The rb1_base_sim metapackage"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native rb1-base-2dnav rb1-base-control rb1-base-gazebo rb1-base-purepursuit"
SRC_URI = "https://github.com/RobotnikAutomation/rb1_base_sim-release/archive/release/kinetic/rb1_base_sim/1.0.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "4bd21cf1924e179e2e9895f7211a7a07"
SRC_URI[sha256sum] = "686efb3caeb68eca53580dcd53fbe68ba9293357193318404b27cc1f7b8902a9"
S = "${WORKDIR}/rb1_base_sim-release-release-kinetic-rb1_base_sim-1.0.2-0"

inherit catkin
