# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Definition of cost map messages (related to the grid map message type)."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native grid-map-msgs message-generation message-runtime std-msgs"
SRC_URI = "https://github.com/stonier/cost_map-release/archive/release/kinetic/cost_map_msgs/0.3.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "6825d0f5ddda95f2130a728c9c978e86"
SRC_URI[sha256sum] = "a1bac82efa5ad9c8747cbe5bcd832a4c7118a8e0621a0b1f5326ad617d9da8c8"
S = "${WORKDIR}/cost_map-release-release-kinetic-cost_map_msgs-0.3.2-0"

inherit catkin
