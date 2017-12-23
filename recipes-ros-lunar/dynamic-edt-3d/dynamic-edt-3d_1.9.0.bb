# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The dynamicEDT3D library implements an inrementally updatable Euclidean distance"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native catkin cmake octomap"
SRC_URI = "https://github.com/ros-gbp/octomap-release/archive/release/lunar/dynamic_edt_3d/1.9.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "96b48ac3861456a54334483bb3a4ca63"
SRC_URI[sha256sum] = "49d82aa634d7f1c95335fab2b88678bc45e53a8f2972679d955494cac52ca500"
S = "${WORKDIR}/octomap-release-release-lunar-dynamic_edt_3d-1.9.0-0"

inherit catkin
