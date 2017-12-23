# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "ROS messages for publishing graphs of different data types"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native geometry-msgs message-generation message-runtime std-msgs"
SRC_URI = "https://github.com/davetcoleman/graph_msgs-release/archive/release/kinetic/graph_msgs/0.1.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "cc91cb2e70ed24a12530e8ea69483979"
SRC_URI[sha256sum] = "d72fb3ab3eac18e4669abdc4af66cecb565edd2275c039be2fe3d5d8ce9b5f8b"
S = "${WORKDIR}/graph_msgs-release-release-kinetic-graph_msgs-0.1.0-0"

inherit catkin
