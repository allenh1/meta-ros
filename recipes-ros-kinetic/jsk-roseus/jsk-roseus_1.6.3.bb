# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "None"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native euslisp geneus roseus"
SRC_URI = "https://github.com/tork-a/jsk_roseus-release/archive/release/kinetic/jsk_roseus/1.6.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "2d4bc555bbf83a21470bfafc40ecf51d"
SRC_URI[sha256sum] = "018b0f09e194df9976282a11f21a1a21f547ec490b4fd150dcef07708d4aac64"
S = "${WORKDIR}/jsk_roseus-release-release-kinetic-jsk_roseus-1.6.3-0"

inherit catkin
