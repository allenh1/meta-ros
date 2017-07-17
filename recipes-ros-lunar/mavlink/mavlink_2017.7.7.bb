# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "MAVLink message marshaling library.
  This package provides C-headers and C++11 "
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "LGPLv3"
LIC_FILES_CHKSUM = "file://package.xml;beginline=19;endline=19;md5=46dd5907f7af0af456f00c524455d867"

DEPENDS = "catkin cmake python python-future python-lxml python-setuptools"
SRC_URI = "https://github.com/mavlink/mavlink-gbp-release/archive/release/lunar/mavlink/2017.7.7-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "50659557195c5a2c3c35430a9fe69879"
SRC_URI[sha256sum] = "073c617783c9afdd34bc5cb1207f1279c2cbaefe53eb31dda48881d00f8f84cd"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
