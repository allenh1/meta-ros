# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Conversions between grid maps and Point Cloud Library (PCL) types."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native grid-map-core pcl-ros"
SRC_URI = "https://github.com/ethz-asl/grid_map-release/archive/release/lunar/grid_map_pcl/1.6.0-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "3efbb3c55af91fa0da8d31e968c023f8"
SRC_URI[sha256sum] = "6e4e7f03b0d609f5ddcade781c5f7fc81fcf752d8ff3bc3e03ae689e39b43d16"
S = "${WORKDIR}/grid_map-release-release-lunar-grid_map_pcl-1.6.0-1"

inherit catkin
