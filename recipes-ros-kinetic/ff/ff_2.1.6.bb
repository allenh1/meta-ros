# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "ff: pddl planner. see http://www.loria.fr/~hoffmanj/ff.html"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "GPL-1"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=162b49cfbae9eadf37c9b89b2d2ac6be"

DEPENDS = "bison ca-certificates catkin-native flex mk openssl rosbash rosbuild roslib rospack unzip"
SRC_URI = "https://github.com/tork-a/jsk_3rdparty-release/archive/release/kinetic/${PN}/2.1.6-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "cded748ee8f5847512f86fd55c0543d3"
SRC_URI[sha256sum] = "a0b0cc5f457a6b66ec1a3d7e34feff59c748725dc6702d852225ccf3f85654d3"
S = "${WORKDIR}/jsk_3rdparty-release-release-kinetic-${PN}-2.1.6-0"

inherit catkin
