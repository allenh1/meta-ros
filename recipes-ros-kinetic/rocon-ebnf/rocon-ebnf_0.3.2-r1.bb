# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Internal packaging of the 0.91 version of the simple python          parser writ"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "GPL-1"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=162b49cfbae9eadf37c9b89b2d2ac6be"

DEPENDS = "catkin-native python-catkin-pkg-native"
SRC_URI = "https://github.com/yujinrobot-release/rocon_tools-release/archive/release/kinetic/rocon_ebnf/0.3.2-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "ca1470adeeea07382dd0869fc8b91670"
SRC_URI[sha256sum] = "edf33279c0cc70f96807eba0264d01dcb8691a2a20954d0c9736a5cd0baab321"
S = "${WORKDIR}/rocon_tools-release-release-kinetic-rocon_ebnf-0.3.2-1"

inherit catkin
