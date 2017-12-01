# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Generates signed distance fields from grid maps."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native grid-map-core pcl-ros"
SRC_URI = "https://github.com/ethz-asl/grid_map-release/archive/release/lunar/grid_map_sdf/1.6.0-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "4171f00cc54604b9fa0fc50fb2b9db12"
SRC_URI[sha256sum] = "7401a2cab95fe835363c7a33b75bcbbf3513ce946eb4c26653cdb817afc2a7f9"
S = "${WORKDIR}/grid_map-release-release-lunar-grid_map_sdf-1.6.0-1"

inherit catkin
