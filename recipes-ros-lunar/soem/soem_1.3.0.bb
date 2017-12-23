# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "SOEM is an open source EtherCAT master library written in c. Its      primary ta"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "GPL-1"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d2094aa59491bce7d3aaf0a0450d7783"

DEPENDS = "catkin-native"
SRC_URI = "https://github.com/smits/${PN}-gbp/archive/release/lunar/${PN}/1.3.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "2ef5fc5eb648209a5d0d55598ea20274"
SRC_URI[sha256sum] = "ef8fcaec2c21afc0d51aceba3a3218313092f6150f127595bc01698b0b279029"
S = "${WORKDIR}/${PN}-gbp-release-lunar-${PN}-1.3.0-0"

inherit catkin
