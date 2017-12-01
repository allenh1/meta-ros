# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "swri_geometry_util"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native cmake-modules cv-bridge eigen libgeos++-dev pkgconfig roscpp tf"
SRC_URI = "https://github.com/swri-robotics-gbp/marti_common-release/archive/release/lunar/swri_geometry_util/1.2.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "aed37d8928f4287ca11a6c8a06ee7aa4"
SRC_URI[sha256sum] = "521cec2864cdd41fc17aba4ebbb046158419d43b7666da1b586e51a7d19f5db6"
S = "${WORKDIR}/marti_common-release-release-lunar-swri_geometry_util-1.2.0-0"

inherit catkin
