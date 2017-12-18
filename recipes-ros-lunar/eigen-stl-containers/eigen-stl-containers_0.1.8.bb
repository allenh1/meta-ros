# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package provides a set of typedef's that allow   using Eigen datatypes in S"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native catkin cmake-modules eigen"
SRC_URI = "https://github.com/ros-gbp/eigen_stl_containers-release/archive/release/lunar/eigen_stl_containers/0.1.8-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "6cdd5e8d0cef14f7bd3f428c2ee3e445"
SRC_URI[sha256sum] = "2df7989ebe36db10452245275613809d02d264d3140bc77b7a6b0413e5c2402f"
S = "${WORKDIR}/eigen_stl_containers-release-release-lunar-eigen_stl_containers-0.1.8-0"

inherit catkin
