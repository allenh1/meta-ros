# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Processing grid maps as a sequence of ROS filters."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native filters grid-map-core grid-map-msgs grid-map-ros"
SRC_URI = "https://github.com/ethz-asl/grid_map-release/archive/release/lunar/grid_map_filters/1.6.0-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "66a16159ff2bbb8ed06d25ee008a06aa"
SRC_URI[sha256sum] = "90747bd666816233a56f4384c86fdde253fcb4e71d2f0f6cd3446f54dcb956dd"
S = "${WORKDIR}/grid_map-release-release-lunar-grid_map_filters-1.6.0-1"

inherit catkin
