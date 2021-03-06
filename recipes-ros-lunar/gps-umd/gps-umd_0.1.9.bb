# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "gps_umd metapackage"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native gps-common gpsd-client"
SRC_URI = "https://github.com/swri-robotics-gbp/gps_umd-release/archive/release/lunar/gps_umd/0.1.9-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "eb3ab82177a9242ca58d4a2d968e3179"
SRC_URI[sha256sum] = "e2b39e933aeb4e11233eb2b9c9ee802e40d4c537fbd35f7d0b1c4dff83a80925"
S = "${WORKDIR}/gps_umd-release-release-lunar-gps_umd-0.1.9-0"

inherit catkin
