# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "swri_math_util"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native roscpp"
SRC_URI = "https://github.com/swri-robotics-gbp/marti_common-release/archive/release/kinetic/swri_math_util/2.0.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "6e732335d16bf36bc515c65f8e70ef3e"
SRC_URI[sha256sum] = "187c7d8189a4e4e70e22ed40a98b26317df3201a5521d3d55f588579f25bc1af"
S = "${WORKDIR}/marti_common-release-release-kinetic-swri_math_util-2.0.0-0"

inherit catkin
