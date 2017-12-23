# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The hector_localization stack is a collection of packages, that provide the full"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native hector-pose-estimation hector-pose-estimation-core message-to-tf"
SRC_URI = "https://github.com/tu-darmstadt-ros-pkg-gbp/hector_localization-release/archive/release/kinetic/hector_localization/0.3.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "f5f893c7e744259c3c5ea99ae0bc3c66"
SRC_URI[sha256sum] = "e1f772dd62ec1624172c4485d270fb3d92416c5e75af019b61ed6205166abf92"
S = "${WORKDIR}/hector_localization-release-release-kinetic-hector_localization-0.3.0-0"

inherit catkin
