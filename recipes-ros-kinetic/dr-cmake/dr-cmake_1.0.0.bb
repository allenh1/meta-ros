# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Some CMake utilities for DR."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=4cd4567faa8f9b08cdfe5d675d01cbbb"

DEPENDS = "catkin-native"
SRC_URI = "https://github.com/delftrobotics/dr_base-release/archive/release/kinetic/dr_cmake/1.0.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "0c27f70cb443e2e95f227fcfc0c25e73"
SRC_URI[sha256sum] = "5b017c812e481c125635e9e696cb7f91ca6ace79539c7d4c3e3f63e18dc2bf51"
S = "${WORKDIR}/dr_base-release-release-kinetic-dr_cmake-1.0.0-0"

inherit catkin
