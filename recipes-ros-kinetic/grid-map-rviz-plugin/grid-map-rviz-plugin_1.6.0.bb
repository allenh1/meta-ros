# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "RViz plugin for displaying grid map messages."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native grid-map-msgs grid-map-ros libqt5-core libqt5-gui libqt5-widgets qtbase5-dev rviz"
SRC_URI = "https://github.com/ethz-asl/grid_map-release/archive/release/kinetic/grid_map_rviz_plugin/1.6.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "501a9ac622882821114189fe59dbb6b9"
SRC_URI[sha256sum] = "b939eab28900a0da603cd41ee191a62a8d9f00deb2011dbf427b95d3c8e1668c"
S = "${WORKDIR}/grid_map-release-release-kinetic-grid_map_rviz_plugin-1.6.0-0"

inherit catkin
