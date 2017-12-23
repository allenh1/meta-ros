# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The package cob_generic_can provides an interface for nodes on a can-bus and exa"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "LGPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=46ee8693f40a89a31023e97ae17ecf19"

DEPENDS = "catkin-native cob-utilities libntcan libpcan socketcan-interface"
SRC_URI = "https://github.com/ipa320/cob_driver-release/archive/release/kinetic/cob_generic_can/0.6.10-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "1fda25c893ffcc228763f0d86618819b"
SRC_URI[sha256sum] = "2b477f4470df0e054f1b9305f320800ccda1d0075098c824fd81ac93e2396ae9"
S = "${WORKDIR}/cob_driver-release-release-kinetic-cob_generic_can-0.6.10-0"

inherit catkin
