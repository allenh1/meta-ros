# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The cob_command_tools stack provides tools, for operating Care-O-bot."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "LGPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=46ee8693f40a89a31023e97ae17ecf19"

DEPENDS = "catkin-native cob-command-gui cob-dashboard cob-helper-tools cob-interactive-teleop cob-monitoring cob-script-server cob-teleop"
SRC_URI = "https://github.com/ipa320/cob_command_tools-release/archive/release/kinetic/cob_command_tools/0.6.6-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "17476dfec984b04964b5b86507c5178c"
SRC_URI[sha256sum] = "1de25efce332f8aee59e6b3eef99bf56c7b83d6a7924620b2a681f8a44596a75"
S = "${WORKDIR}/cob_command_tools-release-release-kinetic-cob_command_tools-0.6.6-0"

inherit catkin
