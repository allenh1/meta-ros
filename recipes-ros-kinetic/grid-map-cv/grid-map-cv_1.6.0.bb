# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Conversions between grid maps and OpenCV images."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native cv-bridge filters grid-map-core"
SRC_URI = "https://github.com/ethz-asl/grid_map-release/archive/release/kinetic/grid_map_cv/1.6.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "9faa0127139d1c8d862950a204ef0784"
SRC_URI[sha256sum] = "93dedf959f56a06f0d8dbcadfefb116fbb11e3cb826ec346b0ddedb4628484b5"
S = "${WORKDIR}/grid_map-release-release-kinetic-grid_map_cv-1.6.0-0"

inherit catkin
