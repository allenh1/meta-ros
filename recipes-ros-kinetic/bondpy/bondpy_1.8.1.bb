# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Python implementation of bond, a mechanism for checking when     another process"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "bond catkin-native rospy smclib uuid"
SRC_URI = "https://github.com/ros-gbp/bond_core-release/archive/release/kinetic/${PN}/1.8.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "428991c17c9d0c8d20ed330960df018b"
SRC_URI[sha256sum] = "7cf42201c087f09fc8971bc166834d38c5c16f8fb24e1f1bee87c0beeec28531"
S = "${WORKDIR}/bond_core-release-release-kinetic-${PN}-1.8.1-0"

inherit catkin
