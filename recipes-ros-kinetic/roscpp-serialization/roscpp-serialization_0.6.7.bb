# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "roscpp_serialization contains the code for serialization as described in     .  "
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native cpp-common roscpp-traits rostime"
SRC_URI = "https://github.com/ros-gbp/roscpp_core-release/archive/release/kinetic/roscpp_serialization/0.6.7-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "c64a0cb63211792402333f55e3f0a39d"
SRC_URI[sha256sum] = "64751afc51f5a2f9264fc7986c70a3f02cd970ef0c31cf1f466926fe229fe06a"
S = "${WORKDIR}/roscpp_core-release-release-kinetic-roscpp_serialization-0.6.7-0"

inherit catkin
