# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The URDF file for a quadrotor to be used with the xpp packages and a      simple"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=18;endline=18;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native roscpp xpp-vis"
SRC_URI = "https://github.com/leggedrobotics/xpp-release/archive/release/kinetic/xpp_quadrotor/1.0.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "16e87916737aa933385a6785207d89b9"
SRC_URI[sha256sum] = "c4fc1e2dbe8762922460564f8842c4b07efc5ada2a82f41c59dc7958f8c24566"
S = "${WORKDIR}/xpp-release-release-kinetic-xpp_quadrotor-1.0.3-0"

inherit catkin
