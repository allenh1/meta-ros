# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The cob_manipulation stack includes packages that provide manipulation capabilit"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "LGPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=46ee8693f40a89a31023e97ae17ecf19"

DEPENDS = "catkin-native cob-collision-monitor cob-grasp-generation cob-lookat-action cob-moveit-bringup cob-moveit-interface cob-obstacle-distance-moveit cob-pick-place-action"
SRC_URI = "https://github.com/ipa320/cob_manipulation-release/archive/release/kinetic/cob_manipulation/0.7.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "4ea2651b2513fab732b7fde0fa2ed012"
SRC_URI[sha256sum] = "d3a7907057143896d45ed4fa9e572a0be07f923741849a7d5cfa69df4d7f0183"
S = "${WORKDIR}/cob_manipulation-release-release-kinetic-cob_manipulation-0.7.0-0"

inherit catkin
