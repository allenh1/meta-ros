# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "swri_opencv_util"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native cv-bridge swri-math-util"
SRC_URI = "https://github.com/swri-robotics-gbp/marti_common-release/archive/release/kinetic/swri_opencv_util/2.0.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "0a4c2d703bb9d90f173b130cbe5ebb3d"
SRC_URI[sha256sum] = "e4eb67e3f15aa0157e7e5652c3c9a35cf7c4e01979a67842226e6e89ebe3a898"
S = "${WORKDIR}/marti_common-release-release-kinetic-swri_opencv_util-2.0.0-0"

inherit catkin
