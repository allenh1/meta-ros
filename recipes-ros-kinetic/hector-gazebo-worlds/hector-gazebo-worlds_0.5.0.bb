# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "hector_gazebo_worlds provides gazebo scenarios used by Team Hector Darmstadt"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native gazebo-ros hector-gazebo-plugins"
SRC_URI = "https://github.com/tu-darmstadt-ros-pkg-gbp/hector_gazebo-release/archive/release/kinetic/hector_gazebo_worlds/0.5.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "71452e53942f895ace0961953497baed"
SRC_URI[sha256sum] = "ab16ea6950e1e37b08650a46b9347fdd8b62882b78a8ad044c9eef56347520e6"
S = "${WORKDIR}/hector_gazebo-release-release-kinetic-hector_gazebo_worlds-0.5.0-0"

inherit catkin
