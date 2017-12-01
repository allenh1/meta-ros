# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Provides wrappers around the yaml-cpp library for various utility functions     "
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "boost catkin-native pkgconfig yaml-cpp"
SRC_URI = "https://github.com/swri-robotics-gbp/marti_common-release/archive/release/lunar/swri_yaml_util/1.2.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "b6fb06b2f1a3097c795423c9976e01ab"
SRC_URI[sha256sum] = "3d3f271a4a903fae58a49ba91e140a01656006c95b1a553e21bae93cec1d34f8"
S = "${WORKDIR}/marti_common-release-release-lunar-swri_yaml_util-1.2.0-0"

inherit catkin
