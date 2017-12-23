# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package contains the launch files that load the required controller interfa"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native robot-state-publisher ros-control ros-controllers summit-x-description summit-xl-pad"
SRC_URI = "https://github.com/RobotnikAutomation/summit_x_sim-release/archive/release/kinetic/summit_x_control/1.1.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "7d6309112798e0517f8f45d678cf8038"
SRC_URI[sha256sum] = "d0db35c688ea68f4565c3e3e5a48b10f60b11b05138644b7735fb87660a593f6"
S = "${WORKDIR}/summit_x_sim-release-release-kinetic-summit_x_control-1.1.1-0"

inherit catkin
