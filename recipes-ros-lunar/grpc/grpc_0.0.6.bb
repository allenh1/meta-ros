# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Catkinized gRPC Package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "autoconf catkin-native git libtool rsync zlib"
SRC_URI = "https://github.com/CogRobRelease/catkin_${PN}-release/archive/release/lunar/${PN}/0.0.6-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "41f210ba383814d06ffa978b88bea5ec"
SRC_URI[sha256sum] = "b077eb1fc32373cc01be74fdf7034489d1c8817fbbbaafda9ae7679dbaf578c6"
S = "${WORKDIR}/catkin_${PN}-release-release-lunar-${PN}-0.0.6-0"

inherit catkin
