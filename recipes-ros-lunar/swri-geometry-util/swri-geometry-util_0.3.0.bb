# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "swri_geometry_util"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin cmake-modules cv-bridge eigen libgeos++-dev pkgconfig roscpp tf"
SRC_URI = "https://github.com/swri-robotics-gbp/marti_common-release/archive/release/lunar/swri_geometry_util/0.3.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "d5326bc13a8f96fe5d7400c87d0b71b6"
SRC_URI[sha256sum] = "e5ab472484157cf4f9ad86ff70810790486a9586cd017009b6d7d5f0e9ead1f5"
S = "${WORKDIR}/marti_common-release-release-lunar-swri_geometry_util-0.3.0-0"

inherit catkin
