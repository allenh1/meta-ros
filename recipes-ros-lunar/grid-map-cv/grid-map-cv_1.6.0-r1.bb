# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Conversions between grid maps and OpenCV images."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native cv-bridge filters grid-map-core"
SRC_URI = "https://github.com/ethz-asl/grid_map-release/archive/release/lunar/grid_map_cv/1.6.0-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "551345241e21fea84a2e8b4588ff4e6c"
SRC_URI[sha256sum] = "5a68f0e74e8d5849f246addb4f6ccc0b0d29753bd62555e586fafc86b77881df"
S = "${WORKDIR}/grid_map-release-release-lunar-grid_map_cv-1.6.0-1"

inherit catkin
