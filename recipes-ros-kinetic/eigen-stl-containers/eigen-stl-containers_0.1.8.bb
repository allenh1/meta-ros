# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package provides a set of typedef's that allow   using Eigen datatypes in S"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native cmake-modules eigen"
SRC_URI = "https://github.com/ros-gbp/eigen_stl_containers-release/archive/release/kinetic/eigen_stl_containers/0.1.8-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "8a63984138eb3cba192165513289f005"
SRC_URI[sha256sum] = "c29f14419997cb09120b564b1463d281c1739739f93b43525f6677c363365b3c"
S = "${WORKDIR}/eigen_stl_containers-release-release-kinetic-eigen_stl_containers-0.1.8-0"

inherit catkin
