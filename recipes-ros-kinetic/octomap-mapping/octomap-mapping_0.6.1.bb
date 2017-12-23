# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Mapping tools to be used with the , implementing a 3D occupancy grid mapping."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=5ee5b8b046ae48ad94a2037ca953a67b"

DEPENDS = "catkin-native octomap-server"
SRC_URI = "https://github.com/ros-gbp/octomap_mapping-release/archive/release/kinetic/octomap_mapping/0.6.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "7e977b50708ad2fee7187a9c36ab5510"
SRC_URI[sha256sum] = "109367aa699fdd9057fe985315d3efb79bf8f881dd9d6f260e7a4a17d47b5fdb"
S = "${WORKDIR}/octomap_mapping-release-release-kinetic-octomap_mapping-0.6.1-0"

inherit catkin
