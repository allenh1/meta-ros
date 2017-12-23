# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package provides a set of simple math utilities to work         with angles"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native"
SRC_URI = "https://github.com/ros-gbp/geometry_${PN}_utils-release/archive/release/kinetic/${PN}/1.9.11-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "fc207bd694608e2a1281fad4d5f1e70b"
SRC_URI[sha256sum] = "5937dd2efcb6ed58eb69a1b57c4d76c76dffad86d787f9c9374fd27faed597de"
S = "${WORKDIR}/geometry_${PN}_utils-release-release-kinetic-${PN}-1.9.11-0"

inherit catkin
