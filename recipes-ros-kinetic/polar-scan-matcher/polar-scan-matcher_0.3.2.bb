# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "None"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "GPL-1"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=162b49cfbae9eadf37c9b89b2d2ac6be"

DEPENDS = "catkin-native geometry-msgs roscpp sensor-msgs tf"
SRC_URI = "https://github.com/ros-gbp/scan_tools-release/archive/release/kinetic/polar_scan_matcher/0.3.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "fc06a93905ced6158c2ea1c77f661f77"
SRC_URI[sha256sum] = "6867ba977e0f86416a88c4c1df098441f1e29f023496265f3caf5b40d33e16ef"
S = "${WORKDIR}/scan_tools-release-release-kinetic-polar_scan_matcher-0.3.2-0"

inherit catkin
