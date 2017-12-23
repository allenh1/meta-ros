# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Processing grid maps as a sequence of ROS filters."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native filters grid-map-core grid-map-msgs grid-map-ros"
SRC_URI = "https://github.com/ethz-asl/grid_map-release/archive/release/kinetic/grid_map_filters/1.6.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "084b6339116f5899fae5242f8aa680e7"
SRC_URI[sha256sum] = "e63062ae8d7ca8af6719d6af3c8a45948faf56c0a5743ee7bd558e623a728acf"
S = "${WORKDIR}/grid_map-release-release-kinetic-grid_map_filters-1.6.0-0"

inherit catkin
