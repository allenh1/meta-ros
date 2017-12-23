# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The hector_slam metapackage that installs hector_mapping and related packages."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=2c00b8d2854109dbebef7818b4dae1e2"

DEPENDS = "catkin-native hector-compressed-map-transport hector-geotiff hector-geotiff-plugins hector-imu-attitude-to-tf hector-map-server hector-map-tools hector-mapping hector-marker-drawing hector-nav-msgs hector-slam-launch hector-trajectory-server"
SRC_URI = "https://github.com/tu-darmstadt-ros-pkg-gbp/hector_slam-release/archive/release/kinetic/hector_slam/0.3.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "40b4cf567941a98dcb9e49bbe0329b66"
SRC_URI[sha256sum] = "0441f8fb971a4213fe1ccdf6711538958b37bdc7d4ecd83e1b43a24c6bccc19d"
S = "${WORKDIR}/hector_slam-release-release-kinetic-hector_slam-0.3.5-0"

inherit catkin
