# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Log4cpp maintained by Orocos developers     This version of log4cpp deviates fro"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "LGPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=515064cbdaf9ba505b62cc09a08ba7b8"

DEPENDS = "catkin-native cmake"
SRC_URI = "https://github.com/orocos-gbp/${PN}-release/archive/release/kinetic/${PN}/2.9.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "f6d93915f56821c6e094800463932c40"
SRC_URI[sha256sum] = "6df7cdfed639d00712d7e1b5e277b1dd6fc2fc6729456d2727465d46499a42ec"
S = "${WORKDIR}/${PN}-release-release-kinetic-${PN}-2.9.0-0"

inherit catkin
