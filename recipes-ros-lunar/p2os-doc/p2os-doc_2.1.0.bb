# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Contains the Documentation for the p2os driver/componenets"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin"
SRC_URI = "https://github.com/allenh1/p2os-release/archive/release/lunar/p2os_doc/2.1.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "d3aac91a0624d00b4bb8970eeaafdf52"
SRC_URI[sha256sum] = "e5256a6aa8160393cd091c3d4a9bfe29d80b13f408214e582eef4928b8812c86"
S = "${WORKDIR}/p2os-release-release-lunar-p2os_doc-2.1.0-0"

inherit catkin
