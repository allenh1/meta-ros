# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Interface for grid maps to the costmap_2d format."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native costmap-2d grid-map-core tf"
SRC_URI = "https://github.com/ethz-asl/grid_map-release/archive/release/kinetic/grid_map_costmap_2d/1.6.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "c602abd6648dc143ce8691bdd64cf121"
SRC_URI[sha256sum] = "25af74c3cdd4f2284e48ac2de75a382ba4494a24058d7e0ec6080cd636bdcf94"
S = "${WORKDIR}/grid_map-release-release-kinetic-grid_map_costmap_2d-1.6.0-0"

inherit catkin
