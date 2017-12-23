# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Non-ROS software for Kobuki, Yujin Robot's mobile research base."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native kobuki-dock-drive kobuki-driver kobuki-ftdi"
SRC_URI = "https://github.com/yujinrobot-release/kobuki_core-release/archive/release/kinetic/kobuki_core/0.7.8-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "b755c30ea7907f2133d6b5ebd3cb5a38"
SRC_URI[sha256sum] = "7bd843d734a13c222ee0844601173d3627c174903e964327b9082e5cb3895609"
S = "${WORKDIR}/kobuki_core-release-release-kinetic-kobuki_core-0.7.8-1"

inherit catkin
