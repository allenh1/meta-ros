# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "pr2eus_moveit"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native control-msgs moveit-msgs pr2eus roseus"
SRC_URI = "https://github.com/tork-a/jsk_pr2eus-release/archive/release/kinetic/pr2eus_moveit/0.3.10-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "9dbcf71d28eebb123792d781712d9b45"
SRC_URI[sha256sum] = "34daf5f4564d58944d4b44c1cc94ff732180b73f7ee233ee442800f56cac9ecd"
S = "${WORKDIR}/jsk_pr2eus-release-release-kinetic-pr2eus_moveit-0.3.10-0"

inherit catkin
