# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Provides Python to ROS multiprocess API, useful for using ROS from different mul"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native catkin-pip pyros-common pyros-interfaces-ros python-mock"
SRC_URI = "https://github.com/asmodehn/${PN}-rosrelease/archive/release/kinetic/${PN}/0.4.1-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "c5d73ac0ba11a1b4f67f8405ecfd9c93"
SRC_URI[sha256sum] = "8046e13cf170c87983ca72777e7f89a52fe5c27301d033860d0fa7ee19c68edd"
S = "${WORKDIR}/${PN}-rosrelease-release-kinetic-${PN}-0.4.1-1"

inherit catkin
