# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "hector_models contains (urdf) models of robots, sensors etc."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native hector-sensors-description hector-xacro-tools"
SRC_URI = "https://github.com/tu-darmstadt-ros-pkg-gbp/hector_models-release/archive/release/kinetic/hector_models/0.4.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "cf6fb29966f5e9c06411a15842fac4eb"
SRC_URI[sha256sum] = "beb9f38fbac185a339c775522c6c9387933bcf6237e777189d5056a22aa03a01"
S = "${WORKDIR}/hector_models-release-release-kinetic-hector_models-0.4.2-0"

inherit catkin
