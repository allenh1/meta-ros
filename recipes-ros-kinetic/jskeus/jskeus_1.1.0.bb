# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "EusLisp software developed and used by JSK at The University of Tokyo"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native euslisp"
SRC_URI = "https://github.com/tork-a/${PN}-release/archive/release/kinetic/${PN}/1.1.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "9f077a66c792274810c5c289c0121173"
SRC_URI[sha256sum] = "3d6a82133cee4c049b02851ef8250fd6e7df9776597078919369f6ab6e3c3433"
S = "${WORKDIR}/${PN}-release-release-kinetic-${PN}-1.1.0-0"

inherit catkin
