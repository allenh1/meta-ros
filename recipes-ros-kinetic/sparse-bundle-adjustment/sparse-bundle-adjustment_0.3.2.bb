# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "ROS wrapper for the sparse bundle adjustment (sba) library (needed for slam_kart"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=5;endline=5;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native cmake-modules eigen libblas-dev liblapack-dev suitesparse"
SRC_URI = "https://github.com/ros-gbp/sparse_bundle_adjustment-release/archive/release/kinetic/sparse_bundle_adjustment/0.3.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "26bd8a286469f6aad80197ee264d9d5a"
SRC_URI[sha256sum] = "5135a9ad619561403a733ba7d1405364d417963f4863d32229e3f19a3e5dbccd"
S = "${WORKDIR}/sparse_bundle_adjustment-release-release-kinetic-sparse_bundle_adjustment-0.3.2-0"

inherit catkin
