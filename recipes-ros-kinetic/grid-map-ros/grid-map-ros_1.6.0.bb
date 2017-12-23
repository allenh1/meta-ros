# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "ROS interface for the grid map library to manage two-dimensional grid maps with "
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native cv-bridge geometry-msgs grid-map-core grid-map-cv grid-map-msgs nav-msgs rosbag roscpp sensor-msgs std-msgs tf visualization-msgs"
SRC_URI = "https://github.com/ethz-asl/grid_map-release/archive/release/kinetic/grid_map_ros/1.6.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "734576f810e5ba48e22cab2f62cd3df2"
SRC_URI[sha256sum] = "ef20867b6472894e08493091c1741bf1baec9894fd047c0ea76555ca3459c3b5"
S = "${WORKDIR}/grid_map-release-release-kinetic-grid_map_ros-1.6.0-0"

inherit catkin
