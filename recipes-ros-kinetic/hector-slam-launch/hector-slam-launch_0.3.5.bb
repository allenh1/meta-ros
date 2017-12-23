# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "hector_slam_launch contains launch files for launching hector_slam with differen"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=2c00b8d2854109dbebef7818b4dae1e2"

DEPENDS = "catkin-native hector-geotiff hector-geotiff-plugins hector-map-server hector-mapping hector-trajectory-server"
SRC_URI = "https://github.com/tu-darmstadt-ros-pkg-gbp/hector_slam-release/archive/release/kinetic/hector_slam_launch/0.3.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "4e5e0a16065951909fd2602969423dea"
SRC_URI[sha256sum] = "bba85c03b7ceb0494cab6d0c4396bf5caf898e71210671f3011db010ce9262f0"
S = "${WORKDIR}/hector_slam-release-release-kinetic-hector_slam_launch-0.3.5-0"

inherit catkin
