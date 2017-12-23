# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Universal grid map library to manage two-dimensional grid maps with multiple dat"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native eigen"
SRC_URI = "https://github.com/ethz-asl/grid_map-release/archive/release/kinetic/grid_map_core/1.6.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "a7974a4b1fec70bcd8fb01a95331e0a8"
SRC_URI[sha256sum] = "55df357cf0ece429c064ee338f5636f19fa4c608a84e62fbc8230716392d67a5"
S = "${WORKDIR}/grid_map-release-release-kinetic-grid_map_core-1.6.0-0"

inherit catkin
