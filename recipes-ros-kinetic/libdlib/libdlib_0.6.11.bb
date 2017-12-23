# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package wraps the external c++ library dlib (http://dlib.net/) in a ROS pac"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "Boost-1.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=09979e3a2d22cfca05fa582289195959"

DEPENDS = "catkin-native"
SRC_URI = "https://github.com/ipa320/cob_extern-release/archive/release/kinetic/${PN}/0.6.11-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "af786df1dd5a68367045624ec5144e77"
SRC_URI[sha256sum] = "9a0a759bcb02a5f0bb51c004785bc2b875adedc47696fcc7f6028ffc7ac26c5f"
S = "${WORKDIR}/cob_extern-release-release-kinetic-${PN}-0.6.11-0"

inherit catkin
