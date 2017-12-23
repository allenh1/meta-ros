# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "hector_map_tools contains some functions related to accessing information from O"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=2c00b8d2854109dbebef7818b4dae1e2"

DEPENDS = "catkin-native eigen nav-msgs"
SRC_URI = "https://github.com/tu-darmstadt-ros-pkg-gbp/hector_slam-release/archive/release/kinetic/hector_map_tools/0.3.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "31cf70a10f29b8fe8c709f6e9748f662"
SRC_URI[sha256sum] = "859a4ea5632ad469694755ed6f6f1a7436013803a4337f217c91aa9de23b0286"
S = "${WORKDIR}/hector_slam-release-release-kinetic-hector_map_tools-0.3.5-0"

inherit catkin
