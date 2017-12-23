# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Serial is a cross-platform, simple to use library for using serial ports on comp"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=58e54c03ca7f821dd3967e2a2cd1596e"

DEPENDS = "catkin-native"
SRC_URI = "https://github.com/wjwwood/${PN}-release/archive/release/kinetic/${PN}/1.2.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "9c84f8f3fe4d4861ac4539a366538c6a"
SRC_URI[sha256sum] = "bd106e47ede64b3e9309ed796b8a1f9dba4b8f2cb24e70dbc9c3032e4c9909a0"
S = "${WORKDIR}/${PN}-release-release-kinetic-${PN}-1.2.1-0"

inherit catkin
