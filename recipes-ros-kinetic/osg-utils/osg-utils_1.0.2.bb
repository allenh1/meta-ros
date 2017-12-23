# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "osg_utils is a library that contains some classes that may be useful in ROS-OSG "
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native geometry-msgs libopenscenegraph roscpp tf"
SRC_URI = "https://github.com/uji-ros-pkg/visualization_osg-release/archive/release/kinetic/osg_utils/1.0.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "eb69e4b0343d844f5919ae5e24af9895"
SRC_URI[sha256sum] = "b373910f54cfa60107bc4faf65ef211c4ffd45ebed37bdf539d9b6158cb96266"
S = "${WORKDIR}/visualization_osg-release-release-kinetic-osg_utils-1.0.2-0"

inherit catkin
