# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "swri_geometry_util"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=23f8de2430b349800266ded71351769e"

DEPENDS = "catkin cmake_modules cv_bridge eigen libgeos++-dev pkg-config roscpp tf"
SRC_URI = "https://github.com/swri-robotics-gbp/marti_common-release/archive/release/lunar/swri_geometry_util/0.3.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "d5326bc13a8f96fe5d7400c87d0b71b6"
SRC_URI[sha256sum] = "e5ab472484157cf4f9ad86ff70810790486a9586cd017009b6d7d5f0e9ead1f5"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
