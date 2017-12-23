# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "hector_compressed_map_transport provides means for transporting compressed map d"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=2c00b8d2854109dbebef7818b4dae1e2"

DEPENDS = "catkin-native cv-bridge eigen geometry-msgs hector-map-tools image-transport nav-msgs sensor-msgs"
SRC_URI = "https://github.com/tu-darmstadt-ros-pkg-gbp/hector_slam-release/archive/release/kinetic/hector_compressed_map_transport/0.3.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "314eb7cd13c93617101e839f38d7dfd5"
SRC_URI[sha256sum] = "8b0b05a9c93ad57c56e1131b46e24ef8e6a9b6d8e2ec7dfc667a1a029688ce10"
S = "${WORKDIR}/hector_slam-release-release-kinetic-hector_compressed_map_transport-0.3.5-0"

inherit catkin
