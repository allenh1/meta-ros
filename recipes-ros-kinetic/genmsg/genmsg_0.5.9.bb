# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Standalone Python library for generating ROS message and service data structures"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native"
SRC_URI = "https://github.com/ros-gbp/${PN}-release/archive/release/kinetic/${PN}/0.5.9-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "8853c48ca2e15eaa8da886825508fe40"
SRC_URI[sha256sum] = "4e135c1c4d2ec611cb3efd0543a773833667968ea487a1251b0b606518805f73"
S = "${WORKDIR}/${PN}-release-release-kinetic-${PN}-0.5.9-0"

inherit catkin
