# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The abseil_cpp package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "Apache-1.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=211ba54883815de9f52a3dcd9f281523"

DEPENDS = "catkin-native rsync"
SRC_URI = "https://github.com/Eurecat/abseil_cpp-release/archive/release/kinetic/abseil_cpp/0.2.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "b787030fc01defbe0ed9b861ea36145c"
SRC_URI[sha256sum] = "9e9b374fac979fe1f29298d98498d481e12346f1a0c8e0aaca79a0dd01138feb"
S = "${WORKDIR}/abseil_cpp-release-release-kinetic-abseil_cpp-0.2.3-0"

inherit catkin
