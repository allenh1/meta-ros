# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A simple actionlib CLI client"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native"
SRC_URI = "https://github.com/po1/${PN}-release/archive/release/kinetic/${PN}/0.1.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "3c11b62e6d217db208004c6d9f2b91ae"
SRC_URI[sha256sum] = "684efecba78e312cbe928e090b282b6e7376fddace2e8b2a707a3880e05eac3c"
S = "${WORKDIR}/${PN}-release-release-kinetic-${PN}-0.1.0-0"

inherit catkin
