# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Orocos component library     This package contains standard components for the O"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "LGPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=1da2c67885e8152ec740f5df02cc3f51"

DEPENDS = "catkin-native cmake libncurses-dev libreadline-dev log4cpp lua-dev netcdf rtt"
SRC_URI = "https://github.com/orocos-gbp/${PN}-release/archive/release/kinetic/${PN}/2.9.0-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "8271341b541cce89ab27ccbafa28d087"
SRC_URI[sha256sum] = "117ba27fda71b1f601c74b7d8f315b10d831230bfdb2b3fe9fc76a90116f1c00"
S = "${WORKDIR}/${PN}-release-release-kinetic-${PN}-2.9.0-1"

inherit catkin
