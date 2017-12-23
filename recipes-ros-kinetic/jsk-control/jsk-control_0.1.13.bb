# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The jsk_control package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native eus-nlopt eus-qp eus-qpoases joy-mouse jsk-calibration jsk-footstep-controller jsk-footstep-planner jsk-ik-server jsk-teleop-joy"
SRC_URI = "https://github.com/tork-a/jsk_control-release/archive/release/kinetic/jsk_control/0.1.13-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "3d36b399df824b2a93553fc995a7efa3"
SRC_URI[sha256sum] = "e14bc7f8a0c1cf0bc9f9763d744c68a3a2debe47cbbb3ae69c9f5df516193ae5"
S = "${WORKDIR}/jsk_control-release-release-kinetic-jsk_control-0.1.13-0"

inherit catkin
