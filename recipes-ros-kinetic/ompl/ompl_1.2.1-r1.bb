# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "OMPL is a free sampling-based motion planning library."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "boost cmake eigen"
SRC_URI = "https://github.com/ros-gbp/${PN}-release/archive/release/kinetic/${PN}/1.2.1-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "92f97e0b588aeaea21b7fe372d24e9c0"
SRC_URI[sha256sum] = "391308ebe4feb777c6b6dc8eb7ae3b4657ac33e23abce3c2d3b3d7aa77af5b1a"
S = "${WORKDIR}/${PN}-release-release-kinetic-${PN}-1.2.1-1"

inherit catkin
