# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Definition of the multi-layered grid map message type."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native geometry-msgs message-generation message-runtime roscpp std-msgs"
SRC_URI = "https://github.com/ethz-asl/grid_map-release/archive/release/kinetic/grid_map_msgs/1.6.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "3c9c08e902d432a50ba3597db9cd8da5"
SRC_URI[sha256sum] = "88d53a0437f1caf11c0135981a05421e3eb72578d5dbccb7c33c9999e63aa786"
S = "${WORKDIR}/grid_map-release-release-kinetic-grid_map_msgs-1.6.0-0"

inherit catkin
