# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Metapackage that contains common tutorials"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib-tutorials catkin-native nodelet-tutorial-math pluginlib-tutorials turtle-actionlib"
SRC_URI = "https://github.com/ros-gbp/common_tutorials-release/archive/release/kinetic/common_tutorials/0.1.10-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "1ba59647866cfca569e58ed907ea75b7"
SRC_URI[sha256sum] = "071a417d5d0201df38c9b9ca06ac0f2836b78f249397367ad704bec5d704d9ef"
S = "${WORKDIR}/common_tutorials-release-release-kinetic-common_tutorials-0.1.10-0"

inherit catkin
