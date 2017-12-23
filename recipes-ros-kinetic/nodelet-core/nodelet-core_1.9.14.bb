# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Nodelet Core Metapackage"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native nodelet nodelet-topic-tools"
SRC_URI = "https://github.com/ros-gbp/nodelet_core-release/archive/release/kinetic/nodelet_core/1.9.14-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "9df7fbc3838d661130e0c6dd5aa41fe7"
SRC_URI[sha256sum] = "c4f6f3fc7da608a13f4196b39d035cf9c9474b9eb4ba3d340cc21d811ac3f31e"
S = "${WORKDIR}/nodelet_core-release-release-kinetic-nodelet_core-1.9.14-0"

inherit catkin
