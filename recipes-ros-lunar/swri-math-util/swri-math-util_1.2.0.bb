# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "swri_math_util"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native roscpp"
SRC_URI = "https://github.com/swri-robotics-gbp/marti_common-release/archive/release/lunar/swri_math_util/1.2.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "bbe44f9a90dcb6667b8f12a3f5bee56d"
SRC_URI[sha256sum] = "8f4b0bafea3e003f20763d68efd8bde349b8d33d9858e067778a14145a9f39a3"
S = "${WORKDIR}/marti_common-release-release-lunar-swri_math_util-1.2.0-0"

inherit catkin
