# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package contains the list of supported robots within the care-o-bot family."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "LGPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=46ee8693f40a89a31023e97ae17ecf19"

DEPENDS = "catkin-native"
SRC_URI = "https://github.com/ipa320/cob_supported_robots-release/archive/release/kinetic/cob_supported_robots/0.6.7-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "0801e2e227163a9cc9e529bd83b15d29"
SRC_URI[sha256sum] = "d27ec7650d44d2becf68df22af5b4bf81cdb3bc118268394e12fed31ad64fe80"
S = "${WORKDIR}/cob_supported_robots-release-release-kinetic-cob_supported_robots-0.6.7-0"

inherit catkin
