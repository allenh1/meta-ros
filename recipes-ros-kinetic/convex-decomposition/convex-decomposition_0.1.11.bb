# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Convex Decomposition Tool for Robot Model"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=58e54c03ca7f821dd3967e2a2cd1596e"

DEPENDS = "catkin-native unzip"
SRC_URI = "https://github.com/ros-gbp/convex_decomposition-release/archive/release/kinetic/convex_decomposition/0.1.11-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "3afe584bac9273e96e5c07067ec65b30"
SRC_URI[sha256sum] = "990f02bf853c764648a95c2005bb32176728baf03ef691676979bdc45881a0fc"
S = "${WORKDIR}/convex_decomposition-release-release-kinetic-convex_decomposition-0.1.11-0"

inherit catkin
