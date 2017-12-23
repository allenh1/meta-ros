# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "hector_nav_msgs contains messages and services used in the hector_slam stack."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=2c00b8d2854109dbebef7818b4dae1e2"

DEPENDS = "catkin-native geometry-msgs message-generation message-runtime nav-msgs"
SRC_URI = "https://github.com/tu-darmstadt-ros-pkg-gbp/hector_slam-release/archive/release/kinetic/hector_nav_msgs/0.3.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "b661beb0de86a1dcd4924bc41e274636"
SRC_URI[sha256sum] = "8e319c05ff7432afa5a87f5d9d03312b95df648c9cd570058e65c43dfe716aea"
S = "${WORKDIR}/hector_slam-release-release-kinetic-hector_nav_msgs-0.3.5-0"

inherit catkin
