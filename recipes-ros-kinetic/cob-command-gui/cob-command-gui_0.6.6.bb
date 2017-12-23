# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package provides a simple GUI for operating Care-O-bot."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "LGPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=46ee8693f40a89a31023e97ae17ecf19"

DEPENDS = "catkin-native cob-msgs cob-script-server python-pygraphviz roslib rospy"
SRC_URI = "https://github.com/ipa320/cob_command_tools-release/archive/release/kinetic/cob_command_gui/0.6.6-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "e20ef06ac19b0065d253001772126099"
SRC_URI[sha256sum] = "71d27d817614842d4a5ee9affe1232ca330b3163d048c4edcedf606ceb4fabe2"
S = "${WORKDIR}/cob_command_tools-release-release-kinetic-cob_command_gui-0.6.6-0"

inherit catkin
