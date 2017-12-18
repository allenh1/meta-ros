# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Configurable tool to visualize grid maps in RViz."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native catkin grid-map-core grid-map-msgs grid-map-ros nav-msgs roscpp sensor-msgs tf visualization-msgs"
SRC_URI = "https://github.com/ethz-asl/grid_map-release/archive/release/lunar/grid_map_visualization/1.6.0-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "e34d823f70ee7615674ea5acb8d28c42"
SRC_URI[sha256sum] = "f8e33765c4b8ce872aeb9d1e81b727ce0f6362dc8438b76056a2afa7a5b0063d"
S = "${WORKDIR}/grid_map-release-release-lunar-grid_map_visualization-1.6.0-1"

inherit catkin
