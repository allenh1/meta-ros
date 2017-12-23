# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "None"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native geometry-msgs roscpp tf"
SRC_URI = "https://github.com/durovsky/binpicking_utils-release/archive/release/kinetic/binpicking_simple_utils/0.1.4-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "206ad41d6afff92e2edc8be1ba437342"
SRC_URI[sha256sum] = "d1375bd5f7379048fb2c3a67729e4dfe43fb280c6f6744ec0ec4d87065f1a118"
S = "${WORKDIR}/binpicking_utils-release-release-kinetic-binpicking_simple_utils-0.1.4-0"

inherit catkin
