# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "octomap_server loads a 3D map (as Octree-based OctoMap) and distributes it to ot"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native dynamic-reconfigure libpcl-all libpcl-all-dev nav-msgs nodelet octomap octomap-msgs octomap-ros pcl-conversions pcl-ros roscpp sensor-msgs std-msgs std-srvs visualization-msgs"
SRC_URI = "https://github.com/ros-gbp/octomap_mapping-release/archive/release/kinetic/octomap_server/0.6.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "533483e426beb30726542be346396fc2"
SRC_URI[sha256sum] = "75b3ad03bcef61e27fb9d19c5ad1efb1ffccb8fc2353c355e58a31b9eb3802b0"
S = "${WORKDIR}/octomap_mapping-release-release-kinetic-octomap_server-0.6.1-0"

inherit catkin
