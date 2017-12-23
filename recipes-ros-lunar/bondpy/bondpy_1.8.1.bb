# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Python implementation of bond, a mechanism for checking when     another process"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "bond catkin-native catkin rospy smclib uuid"
SRC_URI = "https://github.com/ros-gbp/bond_core-release/archive/release/lunar/${PN}/1.8.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "ef610a460da30048339c36e197e1cb60"
SRC_URI[sha256sum] = "50446a435e49cc23d4c5104eb1d499247a89076883b58b4c91398d4dde284fcb"
S = "${WORKDIR}/bond_core-release-release-lunar-${PN}-1.8.1-0"

inherit catkin
