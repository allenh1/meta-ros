# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "ffha: PDDL Planner (http://ipc.informatik.uni-freiburg.de)"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "GPL-1"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=162b49cfbae9eadf37c9b89b2d2ac6be"

DEPENDS = "bison catkin-native flex gawk mk rosbuild roslib rospack"
SRC_URI = "https://github.com/tork-a/jsk_3rdparty-release/archive/release/kinetic/${PN}/2.1.6-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "c9e7325d9181d6889265d497072ccacb"
SRC_URI[sha256sum] = "a21872a2943563445bacb7e84764d147453cb1598dfa611bd86367e27f20b303"
S = "${WORKDIR}/jsk_3rdparty-release-release-kinetic-${PN}-2.1.6-0"

inherit catkin
