# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Conversions between grid maps and Point Cloud Library (PCL) types."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native grid-map-core pcl-ros"
SRC_URI = "https://github.com/ethz-asl/grid_map-release/archive/release/kinetic/grid_map_pcl/1.6.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "626499dd9638dbb935b4d3e82730bf23"
SRC_URI[sha256sum] = "b54ef1673c44868390bcfa05c710118cbcadc92b2aa07618040a192f8c7afd51"
S = "${WORKDIR}/grid_map-release-release-kinetic-grid_map_pcl-1.6.0-0"

inherit catkin
