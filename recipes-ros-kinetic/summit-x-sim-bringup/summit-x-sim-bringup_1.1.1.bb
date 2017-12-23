# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Launch files for Summit-X simulation."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native gazebo-ros summit-x-control summit-x-description summit-xl-pad twist-mux"
SRC_URI = "https://github.com/RobotnikAutomation/summit_x_sim-release/archive/release/kinetic/summit_x_sim_bringup/1.1.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "e1c573a07c3ead4813e4714c8c189c4b"
SRC_URI[sha256sum] = "f681629da03203cfe7465657f2980613dabf29ebece17412aab5d91650875ab4"
S = "${WORKDIR}/summit_x_sim-release-release-kinetic-summit_x_sim_bringup-1.1.1-0"

inherit catkin
