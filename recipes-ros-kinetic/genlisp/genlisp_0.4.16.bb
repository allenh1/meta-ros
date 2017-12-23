# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Common-Lisp ROS message and service generators."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native genmsg"
SRC_URI = "https://github.com/ros-gbp/${PN}-release/archive/release/kinetic/${PN}/0.4.16-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "1ed27e1cbd6b7f08d5b36c2c5e5a4797"
SRC_URI[sha256sum] = "0fdc21d5c9f318a431067f00f9f22241a4ba98b9635a5c3a6d22ba35acdef871"
S = "${WORKDIR}/${PN}-release-release-kinetic-${PN}-0.4.16-0"

inherit catkin
