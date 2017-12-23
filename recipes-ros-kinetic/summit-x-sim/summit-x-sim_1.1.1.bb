# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The summit_x_sim metapackage"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native summit-x-control summit-x-gazebo summit-x-robot-control"
SRC_URI = "https://github.com/RobotnikAutomation/summit_x_sim-release/archive/release/kinetic/summit_x_sim/1.1.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "9ff423e4f48351c61243fe5238e2e09d"
SRC_URI[sha256sum] = "39e892e58c59edcd40eecbc672595b4d72296d9c4310fea6d5b61c20e33b18a6"
S = "${WORKDIR}/summit_x_sim-release-release-kinetic-summit_x_sim-1.1.1-0"

inherit catkin
