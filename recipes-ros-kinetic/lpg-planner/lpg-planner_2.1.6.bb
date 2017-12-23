# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "lpg_planner: LPGL Planner (http://zeus.ing.unibs.it/lpg/)"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "GPL-1"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=162b49cfbae9eadf37c9b89b2d2ac6be"

DEPENDS = "catkin-native"
SRC_URI = "https://github.com/tork-a/jsk_3rdparty-release/archive/release/kinetic/lpg_planner/2.1.6-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "352c0122ffb6042448cd7b74ec7ef84e"
SRC_URI[sha256sum] = "88c3328c10d2b62f4c13e1ee9033eae68c4de4fda21b2a7498931c4d0929c517"
S = "${WORKDIR}/jsk_3rdparty-release-release-kinetic-lpg_planner-2.1.6-0"

inherit catkin
