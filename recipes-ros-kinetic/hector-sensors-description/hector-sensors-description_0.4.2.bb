# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "hector_sensors_description contains URDF xacro macros for sensors, so they are e"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native xacro"
SRC_URI = "https://github.com/tu-darmstadt-ros-pkg-gbp/hector_models-release/archive/release/kinetic/hector_sensors_description/0.4.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "3d0d7a79e62c6e05439f087eac5d5846"
SRC_URI[sha256sum] = "886ab3df8eeaa50660f63f35527af8632e3d3c019e0ecedf885598c4bccd67b2"
S = "${WORKDIR}/hector_models-release-release-kinetic-hector_sensors_description-0.4.2-0"

inherit catkin
