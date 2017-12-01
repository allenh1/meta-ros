# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "MAVLink message marshaling library.   This package provides C-headers and C++11 "
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "LGPLv3"
LIC_FILES_CHKSUM = "file://package.xml;beginline=19;endline=19;md5=b691248d2f70cdaeeaf13696ada5d47c"

DEPENDS = "catkin-native cmake python python-future python-lxml python-setuptools"
SRC_URI = "https://github.com/${PN}/${PN}-gbp-release/archive/release/lunar/${PN}/2017.12.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "3ad44e9a7a2490bb7825efcf69860395"
SRC_URI[sha256sum] = "d6e62bfc6776a60e9305efe1526bc69233427c86cb13b50c30d64c97b9e7e2f3"
S = "${WORKDIR}/${PN}-gbp-release-release-lunar-${PN}-2017.12.1-0"

inherit catkin
