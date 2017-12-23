# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This Package contains Care-O-bot specific service definitions."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "LGPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=46ee8693f40a89a31023e97ae17ecf19"

DEPENDS = "catkin-native message-generation message-runtime"
SRC_URI = "https://github.com/ipa320/cob_common-release/archive/release/kinetic/cob_srvs/0.6.7-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "c45a7e7bd64384055816cbc2f345764c"
SRC_URI[sha256sum] = "91115c93dd98aad5efc19eeb58e74bc2fbd867d5d10314e90361cac604da41dd"
S = "${WORKDIR}/cob_common-release-release-kinetic-cob_srvs-0.6.7-0"

inherit catkin
