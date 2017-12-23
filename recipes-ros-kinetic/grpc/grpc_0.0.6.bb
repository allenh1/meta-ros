# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Catkinized gRPC Package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "autoconf catkin-native git libtool rsync zlib"
SRC_URI = "https://github.com/CogRobRelease/catkin_${PN}-release/archive/release/kinetic/${PN}/0.0.6-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "a4761b772ed5a66c527902113047a0db"
SRC_URI[sha256sum] = "b7268503115d603b6654971bfb12255821d5a2b873465a56648bed309bb4797a"
S = "${WORKDIR}/catkin_${PN}-release-release-kinetic-${PN}-0.0.6-0"

inherit catkin
