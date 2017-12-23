# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Orocos/RTT component framework"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "GPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=7296ddd5afe03edd441a1e2c0822aae6"

DEPENDS = "boost catkin-native cmake omniorb pkgconfig xpath-perl"
SRC_URI = "https://github.com/orocos-gbp/${PN}-release/archive/release/kinetic/${PN}/2.9.0-2.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "a471a02f2317c188df96e8c5430d658b"
SRC_URI[sha256sum] = "a0d78209c9c538538f0f453ee606232cb670a47ea564da7d7eb74ec3343b3040"
S = "${WORKDIR}/${PN}-release-release-kinetic-${PN}-2.9.0-2"

inherit catkin
