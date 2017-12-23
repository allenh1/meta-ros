# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package contains a ROS wrapper for OpenSlam's Gmapping.    The gmapping pac"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "CC-BY-SA-3.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=11e24f757f025b2cbebd5b14b4a7ca19"

DEPENDS = "catkin-native nav-msgs nodelet openslam-gmapping roscpp rostest tf"
SRC_URI = "https://github.com/ros-gbp/slam_${PN}-release/archive/release/kinetic/${PN}/1.3.9-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "df17438c0a8840985f974758525144f6"
SRC_URI[sha256sum] = "8812fd2ade9a91415cbd29d0e48b75fc93c3cc8831b40ffe2a412e85c208f40e"
S = "${WORKDIR}/slam_${PN}-release-release-kinetic-${PN}-1.3.9-0"

inherit catkin
