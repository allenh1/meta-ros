# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package contains a generic CAN interface description with helpers for filte"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "LGPL-3"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=b691248d2f70cdaeeaf13696ada5d47c"

DEPENDS = "boost catkin-native class-loader linux-kernel-headers"
SRC_URI = "https://github.com/ros-industrial-release/ros_canopen-release/archive/release/kinetic/socketcan_interface/0.7.6-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "f2a9492ce4989ab667b395cfab875d7d"
SRC_URI[sha256sum] = "1bd5da3396461ec0ddbe81ca5ffb2c1ae2dde6fd4d5cc5594284f463617aa777"
S = "${WORKDIR}/ros_canopen-release-release-kinetic-socketcan_interface-0.7.6-0"

inherit catkin
