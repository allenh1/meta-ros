# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package provides the third-party KNI (Katana Native Interface) library for "
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "GPL-1"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=162b49cfbae9eadf37c9b89b2d2ac6be"

DEPENDS = "boost catkin-native"
SRC_URI = "https://github.com/uos-gbp/katana_driver-release/archive/release/kinetic/${PN}/1.1.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "f745865368bf15ae456464fe8f89fca9"
SRC_URI[sha256sum] = "728d84330cb0fa9a45a0b62a2aacb3903bbc26bff35cd0baf0e8c3b66bc77a01"
S = "${WORKDIR}/katana_driver-release-release-kinetic-${PN}-1.1.2-0"

inherit catkin
