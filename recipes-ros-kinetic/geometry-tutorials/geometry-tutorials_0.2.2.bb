# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Metapackage of geometry tutorials ROS."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native turtle-tf turtle-tf2"
SRC_URI = "https://github.com/ros-gbp/geometry_tutorials-release/archive/release/kinetic/geometry_tutorials/0.2.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "d628a654b728064042e6bd2d43980781"
SRC_URI[sha256sum] = "628cda1df8b297a0e01003b7bf833cc46f739fe58fe363f49932d5abffa18323"
S = "${WORKDIR}/geometry_tutorials-release-release-kinetic-geometry_tutorials-0.2.2-0"

inherit catkin
