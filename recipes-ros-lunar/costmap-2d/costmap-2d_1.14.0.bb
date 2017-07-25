# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package provides an implementation of a 2D costmap that takes in sensor    "
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=19;endline=19;md5=01c2bc31767ccb3a68e12f02612b2a97"

DEPENDS = "catkin-native cmake-modules dynamic-reconfigure geometry-msgs laser-geometry map-msgs message-filters message-generation message-runtime nav-msgs pcl-conversions pcl-ros pluginlib rosconsole roscpp rostest sensor-msgs std-msgs tf visualization-msgs voxel-grid"
SRC_URI = "https://github.com/ros-gbp/navigation-release/archive/release/lunar/costmap_2d/1.14.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "ded97863b84985ec7db82aecfc608936"
SRC_URI[sha256sum] = "3a42017579a44945c1592e6a40291a586efda611c022d54afdd3bff48cca7c58"
S = "${WORKDIR}/navigation-release-release-lunar-costmap_2d-1.14.0-0"

inherit catkin
