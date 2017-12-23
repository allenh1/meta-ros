# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Bubble icon library for rocon."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native python-catkin-pkg-native"
SRC_URI = "https://github.com/yujinrobot-release/rocon_tools-release/archive/release/kinetic/rocon_bubble_icons/0.3.2-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "c5b810e7c9d6c630e5a6b83feec19f18"
SRC_URI[sha256sum] = "d7f3353e325059f376a2a72d11b876fd3ff4e942e097d8ddb82829f2485e7308"
S = "${WORKDIR}/rocon_tools-release-release-kinetic-rocon_bubble_icons-0.3.2-1"

inherit catkin
