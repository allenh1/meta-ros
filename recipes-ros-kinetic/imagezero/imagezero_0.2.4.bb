# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "ImageZero is a fast lossless image compression algorithm for RGB color photos."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native"
SRC_URI = "https://github.com/swri-robotics-gbp/${PN}_transport-release/archive/release/kinetic/${PN}/0.2.4-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "3248078c1a6e2da22e5438cabffa6643"
SRC_URI[sha256sum] = "884d9217186e536ce0f9b5026b66b7f26d0908c849b2a65f61a70eff239da1d0"
S = "${WORKDIR}/${PN}_transport-release-release-kinetic-${PN}-0.2.4-0"

inherit catkin
