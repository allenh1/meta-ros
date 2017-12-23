# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Underlying data libraries for roscpp messages."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native cpp-common roscpp-serialization roscpp-traits rostime"
SRC_URI = "https://github.com/ros-gbp/roscpp_core-release/archive/release/kinetic/roscpp_core/0.6.7-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "0f2ffa1b2b0094d7ffdf1477f46e8c66"
SRC_URI[sha256sum] = "0144eeed8699d1ea6b09b3f86681c390297f0ddc3c8f0b05a4e0bb53f9da8b80"
S = "${WORKDIR}/roscpp_core-release-release-kinetic-roscpp_core-0.6.7-0"

inherit catkin
