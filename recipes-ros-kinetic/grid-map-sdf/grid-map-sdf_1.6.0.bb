# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Generates signed distance fields from grid maps."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native grid-map-core pcl-ros"
SRC_URI = "https://github.com/ethz-asl/grid_map-release/archive/release/kinetic/grid_map_sdf/1.6.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "5feb1400678bf17fbf35bc6f22eb6fc7"
SRC_URI[sha256sum] = "a229cdbe881abededa625652a4dacbcd79729efeee11d2660a2158ae5a7493ce"
S = "${WORKDIR}/grid_map-release-release-kinetic-grid_map_sdf-1.6.0-0"

inherit catkin
