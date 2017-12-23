# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "swri_system_util"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native roscpp"
SRC_URI = "https://github.com/swri-robotics-gbp/marti_common-release/archive/release/kinetic/swri_system_util/2.0.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "44f4baf5b0d1835e89339fb2c09a8f94"
SRC_URI[sha256sum] = "c08e2223bd46e91e32c8bfb22bd1a4ac5fb2baf02b3d3fbd257870cc22672585"
S = "${WORKDIR}/marti_common-release-release-kinetic-swri_system_util-2.0.0-0"

inherit catkin
