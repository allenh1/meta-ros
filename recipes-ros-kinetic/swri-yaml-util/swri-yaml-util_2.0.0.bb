# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Provides wrappers around the yaml-cpp library for various utility functions     "
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "boost catkin-native pkgconfig yaml-cpp"
SRC_URI = "https://github.com/swri-robotics-gbp/marti_common-release/archive/release/kinetic/swri_yaml_util/2.0.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "9e279ff9e521c6e2d662a8e73b421a0c"
SRC_URI[sha256sum] = "815cb2bca0dfa8f395356ed71e05b185fe520d22f78720e18d2619c8f3c68e44"
S = "${WORKDIR}/marti_common-release-release-kinetic-swri_yaml_util-2.0.0-0"

inherit catkin
