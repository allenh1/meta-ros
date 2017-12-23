# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Rust ROS message and service generators"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native genmsg"
SRC_URI = "https://github.com/adnanademovic/${PN}-release/archive/release/kinetic/${PN}/0.1.0-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "5d2d8a217c9ccd62605ce027a1dc8c0b"
SRC_URI[sha256sum] = "67c1e8dc2db9aa0c8e2f71e3c337bfc86dbc88bc5d752a854267e0aa9df0192e"
S = "${WORKDIR}/${PN}-release-release-kinetic-${PN}-0.1.0-1"

inherit catkin
