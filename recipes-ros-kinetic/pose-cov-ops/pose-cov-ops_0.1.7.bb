# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Library with C++ functions for SE(2/3) pose and 2D/3D point     composition oper"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native geometry-msgs mrpt mrpt-bridge roscpp"
SRC_URI = "https://github.com/mrpt-ros-pkg-release/pose_cov_ops-release/archive/release/kinetic/pose_cov_ops/0.1.7-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "14abe36601cb574c877c8c3804ba8aa9"
SRC_URI[sha256sum] = "54a75bd80c7d11c8ffd6e7a049b37721aed23c6f04941307f154b4df22e897d2"
S = "${WORKDIR}/pose_cov_ops-release-release-kinetic-pose_cov_ops-0.1.7-0"

inherit catkin
