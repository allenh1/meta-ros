# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "An Orocos typekit for Eigen types."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "LGPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=4;endline=4;md5=46ee8693f40a89a31023e97ae17ecf19"

DEPENDS = "catkin-native cmake-modules eigen rtt"
SRC_URI = "https://github.com/orocos-gbp/rtt_geometry-release/archive/release/kinetic/eigen_typekit/2.9.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "21e43d05bb109a042582506a0bb6bdb9"
SRC_URI[sha256sum] = "27b797eaba4c900709c89791c69663d1390d8e15330c98ecc82cf92044411384"
S = "${WORKDIR}/rtt_geometry-release-release-kinetic-eigen_typekit-2.9.1-0"

inherit catkin
