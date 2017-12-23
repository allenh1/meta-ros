# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Configurable tool to visualize grid maps in RViz."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native grid-map-core grid-map-msgs grid-map-ros nav-msgs roscpp sensor-msgs tf visualization-msgs"
SRC_URI = "https://github.com/ethz-asl/grid_map-release/archive/release/kinetic/grid_map_visualization/1.6.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "c335a04f5181c14aecde53bf09f8f5e8"
SRC_URI[sha256sum] = "59cf85923d2370a9792b417e5e1beaa5a61846305e068ba1310bd350cea14fcc"
S = "${WORKDIR}/grid_map-release-release-kinetic-grid_map_visualization-1.6.0-0"

inherit catkin
