# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Loading and publishing grid maps from bag files."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native grid-map-msgs grid-map-ros roscpp"
SRC_URI = "https://github.com/ethz-asl/grid_map-release/archive/release/kinetic/grid_map_loader/1.6.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "9930096bfbfe10ae1840528a2633803a"
SRC_URI[sha256sum] = "1da79156d092cc68727882545cc4f5fc41a5341b19c7356aadb7764597a8ad98"
S = "${WORKDIR}/grid_map-release-release-kinetic-grid_map_loader-1.6.0-0"

inherit catkin
