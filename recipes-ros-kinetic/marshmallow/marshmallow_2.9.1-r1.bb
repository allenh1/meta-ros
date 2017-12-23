# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A lightweight library for converting complex objects to and from simple Python d"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native catkin-pip python-dateutil python-simplejson"
SRC_URI = "https://github.com/asmodehn/${PN}-rosrelease/archive/release/kinetic/${PN}/2.9.1-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "3ad6daa9bb818c1e4483da90f5910e60"
SRC_URI[sha256sum] = "2f7e9fef89263703fb78c0503becd0f1bd6b3d24f8b6888e4c7248275359153d"
S = "${WORKDIR}/${PN}-rosrelease-release-kinetic-${PN}-2.9.1-1"

inherit catkin
