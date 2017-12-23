# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package wraps the libpcan to use it as a ros dependency"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "LGPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=46ee8693f40a89a31023e97ae17ecf19"

DEPENDS = "catkin-native linux-headers-generic"
SRC_URI = "https://github.com/ipa320/cob_extern-release/archive/release/kinetic/${PN}/0.6.11-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "8b3b68742cc66db6f0f8ce0b0270c474"
SRC_URI[sha256sum] = "116a084225acee644f3633b20224c89536d5273d06a885dbf68772bbf6851a38"
S = "${WORKDIR}/cob_extern-release-release-kinetic-${PN}-0.6.11-0"

inherit catkin
