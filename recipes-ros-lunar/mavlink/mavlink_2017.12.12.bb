# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "MAVLink message marshaling library.   This package provides C-headers and C++11 "
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "LGPLv3"
LIC_FILES_CHKSUM = "file://package.xml;beginline=19;endline=19;md5=b691248d2f70cdaeeaf13696ada5d47c"

DEPENDS = "catkin-native catkin cmake python python-future python-lxml python-setuptools"
SRC_URI = "https://github.com/${PN}/${PN}-gbp-release/archive/release/lunar/${PN}/2017.12.12-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "f859999ca87c80be846d32fc8daf6911"
SRC_URI[sha256sum] = "649de7603013f6e33ba73e9ccbcb00c93fdd320e007ed382424222f835fe759e"
S = "${WORKDIR}/${PN}-gbp-release-release-lunar-${PN}-2017.12.12-0"

inherit catkin
