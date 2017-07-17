# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Underlying data libraries for roscpp messages."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=;endline=;md5="

DEPENDS = "catkin cpp_common roscpp_serialization roscpp_traits rostime"
SRC_URI = "https://github.com/ros-gbp/roscpp_core-release/archive/release/lunar/roscpp_core/0.6.4-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "a84d78018031790816b2aedd59c91fc8"
SRC_URI[sha256sum] = "9c95da7b594e82a6d89cc4eac0ed22dd8c612a9d739de6d290cab225767def49"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
