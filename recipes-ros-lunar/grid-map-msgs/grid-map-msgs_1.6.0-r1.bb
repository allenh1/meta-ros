# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Definition of the multi-layered grid map message type."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native geometry-msgs message-generation message-runtime roscpp std-msgs"
SRC_URI = "https://github.com/ethz-asl/grid_map-release/archive/release/lunar/grid_map_msgs/1.6.0-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "a7a6e3d592da5c3190e2ccea404c1684"
SRC_URI[sha256sum] = "914eea018a889f946384dc6c1f9f88bf38f7a12c947324016e4868d2161aee9d"
S = "${WORKDIR}/grid_map-release-release-lunar-grid_map_msgs-1.6.0-1"

inherit catkin
