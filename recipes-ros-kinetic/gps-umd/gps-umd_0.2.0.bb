# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "gps_umd metapackage"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native gps-common gpsd-client"
SRC_URI = "https://github.com/swri-robotics-gbp/gps_umd-release/archive/release/kinetic/gps_umd/0.2.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "eba561f11e56904f0d4a5a6eeb8e15e5"
SRC_URI[sha256sum] = "ce32a082ced7efeb32c4386533485d3eb757de247039b11a506e17dc8decc474"
S = "${WORKDIR}/gps_umd-release-release-kinetic-gps_umd-0.2.0-0"

inherit catkin
