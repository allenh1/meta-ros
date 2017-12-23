# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Universal grid map library to manage two-dimensional grid maps with multiple dat"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native eigen"
SRC_URI = "https://github.com/ethz-asl/grid_map-release/archive/release/lunar/grid_map_core/1.6.0-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "dc13a30500f4aca0a2ea16f8d06c2c02"
SRC_URI[sha256sum] = "46413aed75a4aae7eb5b4891b1c32b3e2d8ffc64cf01a3f1a8bb1b7cdb01fad9"
S = "${WORKDIR}/grid_map-release-release-lunar-grid_map_core-1.6.0-1"

inherit catkin
