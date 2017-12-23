# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Contains the Documentation for the p2os driver/componenets"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native"
SRC_URI = "https://github.com/allenh1/p2os-release/archive/release/kinetic/p2os_doc/2.1.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "f91852f350ee6d699ba3dc80dab94f78"
SRC_URI[sha256sum] = "658e17590a8a326ecd6f5ede5c8def7b2bc064fea7e02271c1bc84f652e056d6"
S = "${WORKDIR}/p2os-release-release-kinetic-p2os_doc-2.1.0-0"

inherit catkin
