# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The dynamicEDT3D library implements an inrementally updatable Euclidean distance"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native cmake octomap"
SRC_URI = "https://github.com/ros-gbp/octomap-release/archive/release/kinetic/dynamic_edt_3d/1.8.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "03fd4d4fe9efd049c35d7e1afb9fa8c1"
SRC_URI[sha256sum] = "11050cd476d6f3f1ca82e65bbc63caf0565ec6baf633eda978a170930f038a3e"
S = "${WORKDIR}/octomap-release-release-kinetic-dynamic_edt_3d-1.8.1-0"

inherit catkin
