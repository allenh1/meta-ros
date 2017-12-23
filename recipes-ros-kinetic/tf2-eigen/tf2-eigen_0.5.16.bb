# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "tf2_eigen"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native cmake-modules eigen geometry-msgs tf2"
SRC_URI = "https://github.com/ros-gbp/geometry2-release/archive/release/kinetic/tf2_eigen/0.5.16-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "81aa51ffb97be8b617168f4f1dc18afa"
SRC_URI[sha256sum] = "2c9ff02e4145f81d34b4a6cf4a583fa12d7d8f2ef54139f7bd213e2953c13e8e"
S = "${WORKDIR}/geometry2-release-release-kinetic-tf2_eigen-0.5.16-0"

inherit catkin
