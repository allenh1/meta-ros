# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "swri_geometry_util"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native catkin cmake-modules cv-bridge eigen libgeos++-dev pkgconfig roscpp tf"
SRC_URI = "https://github.com/swri-robotics-gbp/marti_common-release/archive/release/lunar/swri_geometry_util/2.0.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "950e407826b2127528aedd4771f03a80"
SRC_URI[sha256sum] = "97bcd2d75fa73469bffa0194a0a4af4538c94cc96a550e11aeb0a7d1ec9ec4bf"
S = "${WORKDIR}/marti_common-release-release-lunar-swri_geometry_util-2.0.0-0"

inherit catkin
