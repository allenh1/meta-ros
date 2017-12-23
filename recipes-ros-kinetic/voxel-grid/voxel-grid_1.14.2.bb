# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "voxel_grid provides an implementation of an efficient 3D voxel grid. The occupan"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=01c2bc31767ccb3a68e12f02612b2a97"

DEPENDS = "catkin-native roscpp"
SRC_URI = "https://github.com/ros-gbp/navigation-release/archive/release/kinetic/voxel_grid/1.14.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "639f2bc16d6d63f6f103c06c4a61b708"
SRC_URI[sha256sum] = "8bbfecb73a8e50ae98453de2dbeafab71bf09fed403166633e4291a174fec726"
S = "${WORKDIR}/navigation-release-release-kinetic-voxel_grid-1.14.2-0"

inherit catkin
