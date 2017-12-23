# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Python implementation of the URDF parser."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native python python-catkin-pkg-native python-lxml"
SRC_URI = "https://github.com/ros-gbp/urdfdom_py-release/archive/release/kinetic/urdfdom_py/0.3.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "8a0c425a1433a81317736b088211aa39"
SRC_URI[sha256sum] = "227ecfa29755182798418037715d3467c7879788669f1c1b8b999b4512e8988d"
S = "${WORKDIR}/urdfdom_py-release-release-kinetic-urdfdom_py-0.3.3-0"

inherit catkin
