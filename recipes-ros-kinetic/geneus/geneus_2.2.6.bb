# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "EusLisp ROS message and service generators."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native genmsg"
SRC_URI = "https://github.com/tork-a/${PN}-release/archive/release/kinetic/${PN}/2.2.6-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "d294734fa71c4482cf605d9129a17efa"
SRC_URI[sha256sum] = "53c761b8f93977f6290596a545abd30b772781bb97b0cd4e1a7285c00d0dc232"
S = "${WORKDIR}/${PN}-release-release-kinetic-${PN}-2.2.6-0"

inherit catkin
