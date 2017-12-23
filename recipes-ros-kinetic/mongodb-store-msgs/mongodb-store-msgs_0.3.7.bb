# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The mongodb_store_msgs package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=2c00b8d2854109dbebef7818b4dae1e2"

DEPENDS = "actionlib actionlib-msgs catkin-native message-generation message-runtime"
SRC_URI = "https://github.com/strands-project-releases/mongodb_store/archive/release/kinetic/mongodb_store_msgs/0.3.7-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "e06b5428c91e820255393508c77c5101"
SRC_URI[sha256sum] = "fa7edf5dbc1584ef2e95326cd4423493ebca63bd7a6c5dbbf3291eaf651b1ce0"
S = "${WORKDIR}/mongodb_store-release-kinetic-mongodb_store_msgs-0.3.7-0"

inherit catkin
