# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Conversions between grid maps and OctoMap types."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native grid-map-core octomap"
SRC_URI = "https://github.com/ethz-asl/grid_map-release/archive/release/lunar/grid_map_octomap/1.6.0-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "c62c4bc8ac7b039dc0b5453e87acf251"
SRC_URI[sha256sum] = "1c608c9759d7554b045bd83fe83676d5b5993923e0af4d49015222e66d8dfb6b"
S = "${WORKDIR}/grid_map-release-release-lunar-grid_map_octomap-1.6.0-1"

inherit catkin
