# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Package bridging NAOqi to executing things on the robot."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "catkin-native"
SRC_URI = "https://github.com/ros-naoqi/naoqi_bridge-release/archive/release/kinetic/naoqi_apps/0.5.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "28d442722bf3db198c631914ab46b3ee"
SRC_URI[sha256sum] = "84d6d32a64d39272d8379909edd05879c9bdb4dad995225e2bfc27bff092d0cc"
S = "${WORKDIR}/naoqi_bridge-release-release-kinetic-naoqi_apps-0.5.5-0"

inherit catkin
