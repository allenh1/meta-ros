# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Conversion functions between:       - Eigen and KDL       - Eigen and geometry_m"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native cmake-modules eigen geometry-msgs orocos-kdl std-msgs"
SRC_URI = "https://github.com/ros-gbp/geometry-release/archive/release/kinetic/eigen_conversions/1.11.9-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "c3994de152c37407ef596dd557904310"
SRC_URI[sha256sum] = "37608f29197051e03374ef024fce58f2fc17dbcca737fc49ad139b7c81b289f5"
S = "${WORKDIR}/geometry-release-release-kinetic-eigen_conversions-1.11.9-0"

inherit catkin
