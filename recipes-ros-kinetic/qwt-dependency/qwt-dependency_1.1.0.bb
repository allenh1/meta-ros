# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This encapsulates the Qwt dependency for a specific ROS distribution and its Qt "
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native"
SRC_URI = "https://github.com/ros-gbp/qwt_dependency-release/archive/release/kinetic/qwt_dependency/1.1.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "5cf86e76807feb4ff60b7d013acf9911"
SRC_URI[sha256sum] = "963373b1a007e572526e56bc4903c2c623478faa7c93f8e56f91135423c65e28"
S = "${WORKDIR}/qwt_dependency-release-release-kinetic-qwt_dependency-1.1.0-0"

inherit catkin
