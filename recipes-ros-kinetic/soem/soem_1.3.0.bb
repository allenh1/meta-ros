# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "SOEM is an open source EtherCAT master library written in c. Its      primary ta"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "GPL-1"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d2094aa59491bce7d3aaf0a0450d7783"

DEPENDS = "catkin-native"
SRC_URI = "https://github.com/smits/${PN}-gbp/archive/release/kinetic/${PN}/1.3.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "2810b7e5d7917b94b2a5a2767bd12713"
SRC_URI[sha256sum] = "a28a315984ad334a4fe3899dd463570993ca632f3943eb0511daf4734d13d535"
S = "${WORKDIR}/${PN}-gbp-release-kinetic-${PN}-1.3.0-0"

inherit catkin
