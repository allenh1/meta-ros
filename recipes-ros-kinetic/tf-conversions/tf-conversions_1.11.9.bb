# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package contains a set of conversion functions to convert common tf datatyp"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=19;endline=19;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native cmake-modules eigen geometry-msgs kdl-conversions orocos-kdl python-orocos-kdl tf"
SRC_URI = "https://github.com/ros-gbp/geometry-release/archive/release/kinetic/tf_conversions/1.11.9-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "e089a8c839a78d21be692251cf3c0b6a"
SRC_URI[sha256sum] = "8fee2dbf9f0fe32faf00d36aaaebb9a5d311b2ff9838c5ef8a7b409b4d655e86"
S = "${WORKDIR}/geometry-release-release-kinetic-tf_conversions-1.11.9-0"

inherit catkin
