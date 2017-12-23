# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "fast downward: PDDL Planner (http://www.fast-downward.org)"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "GPL-1"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=162b49cfbae9eadf37c9b89b2d2ac6be"

DEPENDS = "bison ca-certificates catkin-native flex gawk python rostest time"
SRC_URI = "https://github.com/tork-a/jsk_3rdparty-release/archive/release/kinetic/${PN}/2.1.6-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "9a7e5a94183312805cea2b5358aa7aa9"
SRC_URI[sha256sum] = "70838268d6b854982d4b6e64168fe99fadc0b809cb9b3422e847ed28e1dd9f9c"
S = "${WORKDIR}/jsk_3rdparty-release-release-kinetic-${PN}-2.1.6-0"

inherit catkin
