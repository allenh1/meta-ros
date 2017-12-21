# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "C++ implementation of bond, a mechanism for checking when     another process ha"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "bond boost catkin-native cmake-modules roscpp smclib uuid"
SRC_URI = "https://github.com/ros-gbp/bond_core-release/archive/release/lunar/${PN}/1.8.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "6271065458a9a8a4003b013b036361a6"
SRC_URI[sha256sum] = "73d4b020be594afd91233dbffcb1b7934123fce3e648d37d348394cb2a148e74"
S = "${WORKDIR}/bond_core-release-release-lunar-${PN}-1.8.1-0"

inherit catkin
