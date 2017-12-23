# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Control for Aldebaran's ROMEO robot"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=28;endline=28;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native robot-state-publisher ros-control ros-controllers"
SRC_URI = "https://github.com/ros-aldebaran/romeo_virtual-release/archive/release/kinetic/romeo_control/0.2.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "ef88cfed88cec5a04f322a8ca79dc7fc"
SRC_URI[sha256sum] = "848e63185fa4e2a33d2dfc121418759f40ab710d81b6bb804cc92fcbc0dbb5d4"
S = "${WORKDIR}/romeo_virtual-release-release-kinetic-romeo_control-0.2.3-0"

inherit catkin
