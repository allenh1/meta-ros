# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Demo nodes to demonstrate the usage of the grid map library."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native cv-bridge geometry-msgs grid-map-core grid-map-cv grid-map-filters grid-map-loader grid-map-msgs grid-map-octomap grid-map-ros grid-map-rviz-plugin grid-map-visualization octomap-msgs roscpp sensor-msgs"
SRC_URI = "https://github.com/ethz-asl/grid_map-release/archive/release/kinetic/grid_map_demos/1.6.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "f8f964d5c1ed6ba6553ebbf12fb36ce4"
SRC_URI[sha256sum] = "23a2f316c3bb9c3e2b2537cc673fb7e28a894bebc9346dec422179ad7dec5d40"
S = "${WORKDIR}/grid_map-release-release-kinetic-grid_map_demos-1.6.0-0"

inherit catkin
