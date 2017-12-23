# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A driver for the KVH DSP-3000 single-axis Fiber Optic Gyroscope."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native roscpp roslaunch roslint std-msgs"
SRC_URI = "https://github.com/ros-drivers-gbp/${PN}_drivers-release/archive/release/kinetic/${PN}/1.0.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "86b40f6fc43bf38f8b6cabb65aa27147"
SRC_URI[sha256sum] = "7fba3bf1d3d4efd86ffb7372d4d52a114ae6f8670129af702d67aa0dc246b547"
S = "${WORKDIR}/${PN}_drivers-release-release-kinetic-${PN}-1.0.3-0"

inherit catkin
