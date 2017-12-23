# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "C++ implementation of bond, a mechanism for checking when     another process ha"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "bond boost catkin-native cmake-modules roscpp smclib uuid"
SRC_URI = "https://github.com/ros-gbp/bond_core-release/archive/release/kinetic/${PN}/1.8.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "3f7de09eccaaf15113ef3c7c570ce671"
SRC_URI[sha256sum] = "c26ba1aa1cca8e6d2bb5e7b43bb0d3d9e08664e8578584c7a8d8ed00037d8e29"
S = "${WORKDIR}/bond_core-release-release-kinetic-${PN}-1.8.1-0"

inherit catkin
