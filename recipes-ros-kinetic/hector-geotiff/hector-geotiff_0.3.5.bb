# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "hector_geotiff provides a node that can be used to save occupancy grid map, robo"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=2c00b8d2854109dbebef7818b4dae1e2"

DEPENDS = "catkin-native hector-map-tools hector-nav-msgs libqt4-dev nav-msgs pluginlib roscpp std-msgs"
SRC_URI = "https://github.com/tu-darmstadt-ros-pkg-gbp/hector_slam-release/archive/release/kinetic/hector_geotiff/0.3.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "d7e33bc16b6ebfcea261b8a3a6b535fc"
SRC_URI[sha256sum] = "b7a1cafda8d69bfc4ea87656efe2974e6459434d67ce5b6baa4d0b3b2a84be78"
S = "${WORKDIR}/hector_slam-release-release-kinetic-hector_geotiff-0.3.5-0"

inherit catkin
