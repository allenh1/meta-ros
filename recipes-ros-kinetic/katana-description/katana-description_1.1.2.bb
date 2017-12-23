# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package contains an URDF description of the Katana arm and all supporting m"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "GPL-1"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=162b49cfbae9eadf37c9b89b2d2ac6be"

DEPENDS = "catkin-native convex-decomposition ivcon transmission-interface urdf"
SRC_URI = "https://github.com/uos-gbp/katana_driver-release/archive/release/kinetic/katana_description/1.1.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "66c6e1e3b5b0372f548f2f0ef5bf0b26"
SRC_URI[sha256sum] = "94179ff07e5fb626522d3511665d24fa4254b4068be489dabfc410d97a75a771"
S = "${WORKDIR}/katana_driver-release-release-kinetic-katana_description-1.1.2-0"

inherit catkin
