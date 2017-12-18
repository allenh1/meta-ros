# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Demo nodes to demonstrate the usage of the grid map library."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native catkin cv-bridge geometry-msgs grid-map-core grid-map-cv grid-map-filters grid-map-loader grid-map-msgs grid-map-octomap grid-map-ros grid-map-rviz-plugin grid-map-visualization octomap-msgs roscpp sensor-msgs"
SRC_URI = "https://github.com/ethz-asl/grid_map-release/archive/release/lunar/grid_map_demos/1.6.0-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "60716dd5bca9046619909b4be2a7bbd2"
SRC_URI[sha256sum] = "53ead987cf490c04837a04c50899330ef0c4638d1e6eccfe4ae683753f3fa521"
S = "${WORKDIR}/grid_map-release-release-lunar-grid_map_demos-1.6.0-1"

inherit catkin
