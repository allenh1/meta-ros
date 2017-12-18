# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "ROS interface for the grid map library to manage two-dimensional grid maps with "
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native catkin cv-bridge geometry-msgs grid-map-core grid-map-cv grid-map-msgs nav-msgs rosbag roscpp sensor-msgs std-msgs tf visualization-msgs"
SRC_URI = "https://github.com/ethz-asl/grid_map-release/archive/release/lunar/grid_map_ros/1.6.0-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "7945d51999a0656b6cc0d9b4037dbd56"
SRC_URI[sha256sum] = "2819384cff624e44a2b6d43f1aba454b99845dc7ec8e4df5823693958fba9ab8"
S = "${WORKDIR}/grid_map-release-release-lunar-grid_map_ros-1.6.0-1"

inherit catkin
