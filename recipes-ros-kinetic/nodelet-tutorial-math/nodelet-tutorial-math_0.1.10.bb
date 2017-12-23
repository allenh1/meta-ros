# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Package for Nodelet tutorial."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native nodelet roscpp std-msgs"
SRC_URI = "https://github.com/ros-gbp/common_tutorials-release/archive/release/kinetic/nodelet_tutorial_math/0.1.10-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "2eb0613f959fc3a96268bfe4ec5724c8"
SRC_URI[sha256sum] = "705f4a7923a1d6456c573006f8108a60b19f92de0cdc2ec167dfd047e8f6b943"
S = "${WORKDIR}/common_tutorials-release-release-kinetic-nodelet_tutorial_math-0.1.10-0"

inherit catkin
