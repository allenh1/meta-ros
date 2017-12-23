# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The package cob_canopen_motor implements a controller-drive component which is c"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "LGPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=46ee8693f40a89a31023e97ae17ecf19"

DEPENDS = "catkin-native cob-generic-can cob-utilities roscpp"
SRC_URI = "https://github.com/ipa320/cob_driver-release/archive/release/kinetic/cob_canopen_motor/0.6.10-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "7c6d19d52cc98b28c6853f1e1135d4a0"
SRC_URI[sha256sum] = "35360204c5cd52d93883bced06259194eaa7d48bf434066e3b291f09a5bcf9b6"
S = "${WORKDIR}/cob_driver-release-release-kinetic-cob_canopen_motor-0.6.10-0"

inherit catkin
