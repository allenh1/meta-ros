# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The libg2o library from http://openslam.org/g2o.html"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "boost catkin-native cmake eigen opengl suitesparse"
SRC_URI = "https://github.com/ros-gbp/${PN}-release/archive/release/kinetic/${PN}/2016.4.24-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "ba2a3c0a1d13c5c707e5a9d3ccf9f4f3"
SRC_URI[sha256sum] = "843d00cb59a237f72d48164cb4aa7c92eb05756d8498065b064d16ec78fae326"
S = "${WORKDIR}/${PN}-release-release-kinetic-${PN}-2016.4.24-0"

inherit catkin
