# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The pluginlib package provides tools for writing and dynamically loading plugins"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "boost catkin-native class-loader cmake-modules rosconsole roslib libtinyxml2"
SRC_URI = "https://github.com/ros-gbp/pluginlib-release/archive/release/lunar/pluginlib/1.11.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "e4f3185fc2fed5746e0b0f3ca95d3de6"
SRC_URI[sha256sum] = "ff5b465e6290d95e090892f3c11a72b1270e3bd177ee7f55336d6ddf4d4082f1"
S = "${WORKDIR}/pluginlib-release-release-lunar-pluginlib-1.11.1-0"

inherit catkin
