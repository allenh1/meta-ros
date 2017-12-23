# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Metapackage referencing tutorials related to rviz and visualization."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=01c2bc31767ccb3a68e12f02612b2a97"

DEPENDS = "catkin-native interactive-marker-tutorials librviz-tutorial rviz-plugin-tutorials rviz-python-tutorial visualization-marker-tutorials"
SRC_URI = "https://github.com/ros-gbp/visualization_tutorials-release/archive/release/kinetic/visualization_tutorials/0.10.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "3c76b41afb0a2bd25e1f47e576542090"
SRC_URI[sha256sum] = "4341a3cfb988e6622031f101378c3a7ba13a7fb0d31c280b661466e85f60254b"
S = "${WORKDIR}/visualization_tutorials-release-release-kinetic-visualization_tutorials-0.10.1-0"

inherit catkin
