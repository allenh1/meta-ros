# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The State Machine Compiler (SMC) from http://smc.sourceforge.net/     converts a"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "MPL-1.1"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=e1b5a50d4dd59d8102e41a7a2254462d"

DEPENDS = "catkin-native"
SRC_URI = "https://github.com/ros-gbp/bond_core-release/archive/release/kinetic/${PN}/1.8.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "3608a2fb0f78abcfeb37fe726c9874e6"
SRC_URI[sha256sum] = "c3223865f9b76284c17efdb4cae211e1c235141e259a38b6704fb6cdfecf0942"
S = "${WORKDIR}/bond_core-release-release-kinetic-${PN}-1.8.1-0"

inherit catkin
