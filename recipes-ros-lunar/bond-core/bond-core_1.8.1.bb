# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A bond allows two processes, A and B, to know when the other has     terminated,"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "bond bondcpp bondpy catkin smclib"
SRC_URI = "https://github.com/ros-gbp/bond_core-release/archive/release/lunar/bond_core/1.8.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "ca30068891fdac14cb94e5c43349161c"
SRC_URI[sha256sum] = "7a9b0a5367c2874465f0ed2ef490546ee233e5b7ca7bb2c651fe3fc2b98a40a2"
S = "${WORKDIR}/bond_core-release-release-lunar-bond_core-1.8.1-0"

inherit catkin
