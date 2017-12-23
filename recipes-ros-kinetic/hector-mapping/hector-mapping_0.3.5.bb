# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "hector_mapping is a SLAM approach that can be used without odometry as well as o"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=16;endline=16;md5=2c00b8d2854109dbebef7818b4dae1e2"

DEPENDS = "boost catkin-native eigen laser-geometry message-filters message-generation message-runtime nav-msgs roscpp tf tf-conversions visualization-msgs"
SRC_URI = "https://github.com/tu-darmstadt-ros-pkg-gbp/hector_slam-release/archive/release/kinetic/hector_mapping/0.3.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "8bb090f6d6d5a3b3695c4e091e47313b"
SRC_URI[sha256sum] = "30d1768ad414151ea1e69f71dd154bb11e6c2ae76537a6cdde3e9fd8bfb4a6bd"
S = "${WORKDIR}/hector_slam-release-release-kinetic-hector_mapping-0.3.5-0"

inherit catkin
