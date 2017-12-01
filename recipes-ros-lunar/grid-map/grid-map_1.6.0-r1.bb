# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Meta-package for the universal grid map library."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native grid-map-core grid-map-cv grid-map-demos grid-map-filters grid-map-loader grid-map-msgs grid-map-ros grid-map-rviz-plugin grid-map-visualization"
SRC_URI = "https://github.com/ethz-asl/grid_map-release/archive/release/lunar/grid_map/1.6.0-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "16cdd8b7159bae0aff67718eecb50495"
SRC_URI[sha256sum] = "f527b14a634c96073fc646c92e5f66fecd6128924b56a7fb8f6f180ceaef7bb1"
S = "${WORKDIR}/grid_map-release-release-lunar-grid_map-1.6.0-1"

inherit catkin
