# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package contains a set of conversion functions to convert common tf datatyp"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=19;endline=19;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native cmake-modules eigen geometry-msgs kdl-conversions orocos-kdl python-orocos-kdl tf"
SRC_URI = "https://github.com/ros-gbp/geometry-release/archive/release/lunar/tf_conversions/1.11.9-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "9c668009c0f81e16c1ca5c7e80362555"
SRC_URI[sha256sum] = "f445a43badb7a4a164e7e05e8622cfa0a037bfa4b845f7e9ae95e6e8bebac2a5"
S = "${WORKDIR}/geometry-release-release-lunar-tf_conversions-1.11.9-0"

inherit catkin
