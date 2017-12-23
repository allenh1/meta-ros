# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package contains the rFSM flavor of Statecharts."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "LGPL-2 & BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=2c00b8d2854109dbebef7818b4dae1e2"

DEPENDS = "catkin-native"
SRC_URI = "https://github.com/orocos-gbp/${PN}-release/archive/release/kinetic/${PN}/1.0.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "bda678481a98cf3d6a2fee003848fae9"
SRC_URI[sha256sum] = "08a1910297e5fe5347b6b00b62ef7fd708ce3117731d7a75b091279b795d007f"
S = "${WORKDIR}/${PN}-release-release-kinetic-${PN}-1.0.1-0"

inherit catkin
