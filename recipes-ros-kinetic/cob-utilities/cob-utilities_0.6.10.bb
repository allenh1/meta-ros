# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Deprecated     "cob_utilities" subsumes a number of classes, which are used in t"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "LGPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=46ee8693f40a89a31023e97ae17ecf19"

DEPENDS = "catkin-native"
SRC_URI = "https://github.com/ipa320/cob_driver-release/archive/release/kinetic/cob_utilities/0.6.10-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "81ac12339a4544a134efb81ce3f2a118"
SRC_URI[sha256sum] = "ceb933eebde8df2dd06409c693355e6e2f7b1fbdfe48ec51660e8b2ea2b4b032"
S = "${WORKDIR}/cob_driver-release-release-kinetic-cob_utilities-0.6.10-0"

inherit catkin
