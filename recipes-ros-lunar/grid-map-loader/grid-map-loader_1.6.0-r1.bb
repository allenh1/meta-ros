# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Loading and publishing grid maps from bag files."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native catkin grid-map-msgs grid-map-ros roscpp"
SRC_URI = "https://github.com/ethz-asl/grid_map-release/archive/release/lunar/grid_map_loader/1.6.0-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "53886d9d8779f57991882ff48f3f6a82"
SRC_URI[sha256sum] = "fc7c6fb0ead8d3b7e19daf00bf834d51fcd099720dfb1da937934ed4c2745bcb"
S = "${WORKDIR}/grid_map-release-release-lunar-grid_map_loader-1.6.0-1"

inherit catkin
