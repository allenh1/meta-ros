# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "ROS packaging system"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native mk rosbash rosboost-cfg rosbuild rosclean roscreate roslang roslib rosmake rosunit"
SRC_URI = "https://github.com/${PN}-gbp/${PN}-release/archive/release/kinetic/${PN}/1.13.6-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "6d334a50286b300c8a0d6a248cd9f269"
SRC_URI[sha256sum] = "9d171d5d349f3b8520c5e29dbf42ae975693a974d8eed7f6af47a83bb62c9972"
S = "${WORKDIR}/${PN}-release-release-kinetic-${PN}-1.13.6-0"

inherit catkin
