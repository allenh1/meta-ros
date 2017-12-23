# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The OctoMap library implements a 3D occupancy grid mapping approach, providing d"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native cmake"
SRC_URI = "https://github.com/ros-gbp/${PN}-release/archive/release/kinetic/${PN}/1.8.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "2ac6429a5fd69f7372cb10a8fc393cf7"
SRC_URI[sha256sum] = "dba38c606483ef59bd981c17a08fb381cef0a9d0a20ddfbba35590a3330ecbe6"
S = "${WORKDIR}/${PN}-release-release-kinetic-${PN}-1.8.1-0"

inherit catkin
