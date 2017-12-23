# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Python composable command line utility http://click.pocoo.org/"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native catkin-pip"
SRC_URI = "https://github.com/asmodehn/${PN}-rosrelease/archive/release/kinetic/${PN}/6.2.0-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "2ce997f434b28263747e4700b3247fba"
SRC_URI[sha256sum] = "013f8c679a4570dd4795f91b8984f1ad66b6cfb594b285c8e5087a5a3cc57ef9"
S = "${WORKDIR}/${PN}-rosrelease-release-kinetic-${PN}-6.2.0-1"

inherit catkin
