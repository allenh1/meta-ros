# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "(Python Distribution) A carefully curated collection of Root Certificates for va"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native catkin-pip"
SRC_URI = "https://github.com/asmodehn/${PN}-rosrelease/archive/release/kinetic/${PN}/2015.11.20-3.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "1f36614e39f8d94b55f9b1b5f67be4d9"
SRC_URI[sha256sum] = "4d532dbb968f6d15afdcbcfd6c0aa92218bdcc09a19fc406b3d582a8068c8d2e"
S = "${WORKDIR}/${PN}-rosrelease-release-kinetic-${PN}-2015.11.20-3"

inherit catkin
