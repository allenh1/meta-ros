# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Tutorials showing how to call into rviz internals from python scripts."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native rviz"
SRC_URI = "https://github.com/ros-gbp/visualization_tutorials-release/archive/release/kinetic/rviz_python_tutorial/0.10.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "299a97703c972a32b7855ce7be8c2ce5"
SRC_URI[sha256sum] = "f00554569ee0628b529197f2b745eb1576924ccf48cc045249f6ee13dacf78f2"
S = "${WORKDIR}/visualization_tutorials-release-release-kinetic-rviz_python_tutorial-0.10.1-0"

inherit catkin
