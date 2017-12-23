# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Saturation in the Null Space (SNS) Inverse Kinematic Library.    SNS is a real-t"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=19;endline=19;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "catkin-native eigen kdl-parser orocos-kdl roscpp std-msgs"
SRC_URI = "https://github.com/RethinkRobotics-release/sns_ik-release/archive/release/kinetic/sns_ik_lib/0.2.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "8c4cb281a9740c0507c409223322125f"
SRC_URI[sha256sum] = "ea8bfa9c4d66a8f09f3c8ce6ed2a1ac7673bba0f40873a5490c46c9c4b570723"
S = "${WORKDIR}/sns_ik-release-release-kinetic-sns_ik_lib-0.2.3-0"

inherit catkin
