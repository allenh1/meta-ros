# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Mesh Conversion Utility  Used to generate '.iv' files from '.stl' files.  This p"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "GPL-1"
LIC_FILES_CHKSUM = "file://package.xml;beginline=18;endline=18;md5=162b49cfbae9eadf37c9b89b2d2ac6be"

DEPENDS = "catkin-native"
SRC_URI = "https://github.com/ros-gbp/${PN}-release/archive/release/kinetic/${PN}/0.1.6-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "be3934b75fdc20eb4142181056cd6bd2"
SRC_URI[sha256sum] = "e5fcd7bf432c4c2d73b6bf851b4e88a055a05cd88cb15a90b96a6d3b38847489"
S = "${WORKDIR}/${PN}-release-release-kinetic-${PN}-0.1.6-0"

inherit catkin
