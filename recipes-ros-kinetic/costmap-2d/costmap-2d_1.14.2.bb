# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package provides an implementation of a 2D costmap that takes in sensor    "
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=19;endline=19;md5=01c2bc31767ccb3a68e12f02612b2a97"

DEPENDS = "catkin-native cmake-modules dynamic-reconfigure geometry-msgs laser-geometry map-msgs message-filters message-generation message-runtime nav-msgs pcl-conversions pcl-ros pluginlib rosconsole roscpp sensor-msgs std-msgs tf visualization-msgs voxel-grid"
SRC_URI = "https://github.com/ros-gbp/navigation-release/archive/release/kinetic/costmap_2d/1.14.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "15b5463e0ca7c9dcef32ba8d549b40b6"
SRC_URI[sha256sum] = "7d979f3583437442002195226f650690219f67326659879dec10475b952e6679"
S = "${WORKDIR}/navigation-release-release-kinetic-costmap_2d-1.14.2-0"

inherit catkin
