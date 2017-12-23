# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "rosserial for TivaC Launchpad evaluation boards."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native rosserial-client rosserial-msgs"
SRC_URI = "https://github.com/ros-gbp/rosserial-release/archive/release/kinetic/rosserial_tivac/0.7.7-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "c2d6d212adbeb87232868b477ef8525a"
SRC_URI[sha256sum] = "379b333e6972583e884bd30d5a2d07f5b5cc341a560e6828eb802286c1dea1a8"
S = "${WORKDIR}/rosserial-release-release-kinetic-rosserial_tivac-0.7.7-0"

inherit catkin
