# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package provides an implementation of a 2D costmap that takes in sensor    "
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=21;endline=21;md5=01c2bc31767ccb3a68e12f02612b2a97"

DEPENDS = "catkin-native cmake-modules dynamic-reconfigure geometry-msgs laser-geometry libpcl-all-dev map-msgs message-filters message-generation message-runtime nav-msgs pcl-conversions pcl-ros pluginlib rosconsole roscpp rostest sensor-msgs std-msgs tf visualization-msgs voxel-grid"
SRC_URI = "https://github.com/ros-gbp/navigation-release/archive/release/lunar/costmap_2d/1.15.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "210f3f431fe4840e9f8247a285c33b51"
SRC_URI[sha256sum] = "44c7b705ac0c35b9b3226c8e27207c05dd18ce66c1fc099a3177e77e0e31a65f"
S = "${WORKDIR}/navigation-release-release-lunar-costmap_2d-1.15.1-0"

inherit catkin
