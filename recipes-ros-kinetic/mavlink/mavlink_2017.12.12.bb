# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "MAVLink message marshaling library.   This package provides C-headers and C++11 "
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "LGPL-3"
LIC_FILES_CHKSUM = "file://package.xml;beginline=19;endline=19;md5=b691248d2f70cdaeeaf13696ada5d47c"

DEPENDS = "catkin-native cmake python python-future python-lxml python-setuptools"
SRC_URI = "https://github.com/${PN}/${PN}-gbp-release/archive/release/kinetic/${PN}/2017.12.12-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "3345e6cbffd40396410a57a2d7eb59e8"
SRC_URI[sha256sum] = "4c302bcfb89a51babb8987fd52cd00ac286e62839ae5b98f85b74a05db03ea76"
S = "${WORKDIR}/${PN}-gbp-release-release-kinetic-${PN}-2017.12.12-0"

inherit catkin
