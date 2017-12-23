# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "libfranka is a C++ library for Franka Emika research robots"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "catkin-native cmake libpoco-dev"
SRC_URI = "https://github.com/frankaemika/${PN}-release/archive/release/kinetic/${PN}/0.1.0-3.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "ae02054b52d2ac37786fb5523ae2f8c1"
SRC_URI[sha256sum] = "77f6d3daacbe261e5c41094ec04fe8ed0692f953e6ad7bb6269943b691db64a2"
S = "${WORKDIR}/${PN}-release-release-kinetic-${PN}-0.1.0-3"

inherit catkin
