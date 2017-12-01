# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "MAVLink message marshaling library.   This package provides C-headers and C++11 "
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "LGPLv3"
LIC_FILES_CHKSUM = "file://package.xml;beginline=19;endline=19;md5=b691248d2f70cdaeeaf13696ada5d47c"

DEPENDS = "catkin-native cmake python python-future python-lxml python-setuptools"
SRC_URI = "https://github.com/mavlink/mavlink-gbp-release/archive/release/lunar/mavlink/2017.11.11-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "c0a6cb284cf3213165d02dc09db9f913"
SRC_URI[sha256sum] = "e632aebccbe3b8831a047670dac08303e448abae8a2df605d43dd4c4f346652c"
S = "${WORKDIR}/mavlink-gbp-release-release-lunar-mavlink-2017.11.11-0"

inherit catkin
