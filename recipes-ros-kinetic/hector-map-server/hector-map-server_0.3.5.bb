# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "hector_map_server provides a service for retrieving the map, as well as for rayc"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=2c00b8d2854109dbebef7818b4dae1e2"

DEPENDS = "catkin-native hector-map-tools hector-marker-drawing hector-nav-msgs nav-msgs roscpp tf"
SRC_URI = "https://github.com/tu-darmstadt-ros-pkg-gbp/hector_slam-release/archive/release/kinetic/hector_map_server/0.3.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "b5e10f146bc2b55663145b0a43d5c27e"
SRC_URI[sha256sum] = "916463a0cb7f0b1ffa93bb6c43c72e7b821d33ac2296b54fc8a9c21dd464934d"
S = "${WORKDIR}/hector_slam-release-release-kinetic-hector_map_server-0.3.5-0"

inherit catkin
