# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package provides the third-party KNI (Katana Native Interface) library for "
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "GPL-1"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=162b49cfbae9eadf37c9b89b2d2ac6be"

DEPENDS = "boost catkin-native catkin"
SRC_URI = "https://github.com/uos-gbp/katana_driver-release/archive/release/lunar/${PN}/1.1.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "bfea6347a7933ac463750af29d5e1413"
SRC_URI[sha256sum] = "f121ace6391d8c993c39817db69061f4ba2a824fd41b5b3b7101ce9840987465"
S = "${WORKDIR}/katana_driver-release-release-lunar-${PN}-1.1.2-0"

inherit catkin
