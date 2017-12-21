# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "RViz plugin for displaying grid map messages."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native grid-map-msgs grid-map-ros libqt5-core libqt5-gui libqt5-widgets qtbase5-dev rviz"
SRC_URI = "https://github.com/ethz-asl/grid_map-release/archive/release/lunar/grid_map_rviz_plugin/1.6.0-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "940cf7250c873cef4edd38a3d0008f47"
SRC_URI[sha256sum] = "6334006dc14cd44031bea1b87469a7c3f0a676c50ecab9d21530aa19afc7a302"
S = "${WORKDIR}/grid_map-release-release-lunar-grid_map_rviz_plugin-1.6.0-1"

inherit catkin
