# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package provides a set of simple math utilities to work         with angles"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native catkin"
SRC_URI = "https://github.com/ros-gbp/geometry_${PN}_utils-release/archive/release/lunar/${PN}/1.9.11-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "7defdab86e662fac81aca7605ccfea7e"
SRC_URI[sha256sum] = "e8deedc60c1f06c276cc1cd26017bdb4a651ff60f2a542584d28f8d493f02cea"
S = "${WORKDIR}/geometry_${PN}_utils-release-release-lunar-${PN}-1.9.11-0"

inherit catkin
