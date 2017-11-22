# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Standalone Python library for generating ROS message and service data structures"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin"
SRC_URI = "https://github.com/ros-gbp/genmsg-release/archive/release/lunar/genmsg/0.5.9-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "103b91ed3712f66a2c6aeb07465482bb"
SRC_URI[sha256sum] = "d5fad7fa4eeb1cb4cbc6d0f379f306509e49c2b1d45e969bb2900a62a438a6bf"
S = "${WORKDIR}/genmsg-release-release-lunar-genmsg-0.5.9-0"

inherit catkin
