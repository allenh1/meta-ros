# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "hector_gazebo provides packages related to to simulation of robots using gazebo "
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native hector-gazebo-plugins hector-gazebo-thermal-camera hector-gazebo-worlds"
SRC_URI = "https://github.com/tu-darmstadt-ros-pkg-gbp/hector_gazebo-release/archive/release/kinetic/hector_gazebo/0.5.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "a90130030eafe67ac02704a2db2bbcbc"
SRC_URI[sha256sum] = "be6ee84dc26818499a8270acb80e02fd926874fafc4d6bc7c189ccc7a1f5397e"
S = "${WORKDIR}/hector_gazebo-release-release-kinetic-hector_gazebo-0.5.0-0"

inherit catkin
