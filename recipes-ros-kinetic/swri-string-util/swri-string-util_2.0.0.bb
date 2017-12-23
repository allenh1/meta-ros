# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "swri_string_util"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native"
SRC_URI = "https://github.com/swri-robotics-gbp/marti_common-release/archive/release/kinetic/swri_string_util/2.0.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "00e548925d0110187cdf422043fe554a"
SRC_URI[sha256sum] = "fb6acd0d152f819d7141118080a8d4260aff9ef6e155b3d4f297510269a055bc"
S = "${WORKDIR}/marti_common-release-release-kinetic-swri_string_util-2.0.0-0"

inherit catkin
