# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Interface for grid maps to the costmap_2d format."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native catkin costmap-2d grid-map-core tf"
SRC_URI = "https://github.com/ethz-asl/grid_map-release/archive/release/lunar/grid_map_costmap_2d/1.6.0-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "61ee616402cab3c8de3caf8195b214df"
SRC_URI[sha256sum] = "5e9e28121816753a091ff412a5c362bafdd94ec2b353743ebbf0a6b4ee54446a"
S = "${WORKDIR}/grid_map-release-release-lunar-grid_map_costmap_2d-1.6.0-1"

inherit catkin
