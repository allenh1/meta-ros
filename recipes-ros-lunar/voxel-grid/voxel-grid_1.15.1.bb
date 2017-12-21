# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "voxel_grid provides an implementation of an efficient 3D voxel grid. The occupan"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=01c2bc31767ccb3a68e12f02612b2a97"

DEPENDS = "catkin-native roscpp"
SRC_URI = "https://github.com/ros-gbp/navigation-release/archive/release/lunar/voxel_grid/1.15.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "fb78cc66ccbcf5eb7cd30fcde23d0859"
SRC_URI[sha256sum] = "f1c1e3851ccb6971f162cfc5fec483cd4753f8e80b27544e2542bc5b79a201e6"
S = "${WORKDIR}/navigation-release-release-lunar-voxel_grid-1.15.1-0"

inherit catkin
