# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "hector_components_description contains URDF xacro macros for robot components, s"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native hector-sensors-description hector-xacro-tools xacro"
SRC_URI = "https://github.com/tu-darmstadt-ros-pkg-gbp/hector_models-release/archive/release/kinetic/hector_components_description/0.4.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "850615ef0573018c0efb4ce6fe544834"
SRC_URI[sha256sum] = "c845c768841af7e57034bd4fae5f6a569bed46b0e3a0d540eefebdd62dec3624"
S = "${WORKDIR}/hector_models-release-release-kinetic-hector_components_description-0.4.2-0"

inherit catkin
