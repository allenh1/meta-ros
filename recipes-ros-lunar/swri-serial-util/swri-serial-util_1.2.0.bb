# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "swri_serial_util"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "boost catkin-native"
SRC_URI = "https://github.com/swri-robotics-gbp/marti_common-release/archive/release/lunar/swri_serial_util/1.2.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "17b537ce4d26a9731177e01a574cc548"
SRC_URI[sha256sum] = "6db355c662c2d3a2b00124b0e8f86d89203c6e205e00677a0d3d6e0d4c02b3bd"
S = "${WORKDIR}/marti_common-release-release-lunar-swri_serial_util-1.2.0-0"

inherit catkin
