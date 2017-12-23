# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Meta-package for the universal grid map library."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native grid-map-core grid-map-cv grid-map-demos grid-map-filters grid-map-loader grid-map-msgs grid-map-ros grid-map-rviz-plugin grid-map-visualization"
SRC_URI = "https://github.com/ethz-asl/grid_map-release/archive/release/kinetic/grid_map/1.6.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "a17767535d6f5c04ce60796fedceb00f"
SRC_URI[sha256sum] = "d9fc43aa53ce0f834f4b3428a21733379cee026ee2526f07de5e0a7f11fc7e31"
S = "${WORKDIR}/grid_map-release-release-kinetic-grid_map-1.6.0-0"

inherit catkin
