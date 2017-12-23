# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Conversions between grid maps and OctoMap types."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native grid-map-core octomap"
SRC_URI = "https://github.com/ethz-asl/grid_map-release/archive/release/kinetic/grid_map_octomap/1.6.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "179e3fe84d4e067ab3f09b6230d520f3"
SRC_URI[sha256sum] = "f4618ee1c44f14e8bf55ab930e56c30b631d62e2d5be24682ccb562e582abd73"
S = "${WORKDIR}/grid_map-release-release-kinetic-grid_map_octomap-1.6.0-0"

inherit catkin
