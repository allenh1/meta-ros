# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Implementation of the MultiWii Serial Protocol (MSP)"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "LGPL-3"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=b691248d2f70cdaeeaf13696ada5d47c"

DEPENDS = "asio catkin-native"
SRC_URI = "https://github.com/christianrauch/${PN}-release/archive/release/kinetic/${PN}/2.1.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "46926194e7b0aa947195e70d230b0df4"
SRC_URI[sha256sum] = "0f9c20c48600563b780b992729470dea1aab2c88dd1cf3631ea1c417c5b7e4de"
S = "${WORKDIR}/${PN}-release-release-kinetic-${PN}-2.1.0-0"

inherit catkin
