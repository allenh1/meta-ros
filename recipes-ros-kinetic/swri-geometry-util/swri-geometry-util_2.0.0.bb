# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "swri_geometry_util"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native cmake-modules cv-bridge eigen libgeos++-dev pkgconfig roscpp tf"
SRC_URI = "https://github.com/swri-robotics-gbp/marti_common-release/archive/release/kinetic/swri_geometry_util/2.0.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "0022a03aa9efc2897f7d8c81bc909f7c"
SRC_URI[sha256sum] = "b308c91a5831919e2a4b98349ae4caea77ecc55313a0a87b789a5329c8ac0707"
S = "${WORKDIR}/marti_common-release-release-kinetic-swri_geometry_util-2.0.0-0"

inherit catkin
