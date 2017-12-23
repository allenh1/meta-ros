# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Conversion functions between KDL and geometry_msgs types."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native geometry-msgs orocos-kdl"
SRC_URI = "https://github.com/ros-gbp/geometry-release/archive/release/kinetic/kdl_conversions/1.11.9-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "fa194983d6d08749a8eb26ad962b9490"
SRC_URI[sha256sum] = "34efddf9eb4ade2ba483d41cbe433179eb50f0533c9b3bddc023c242375be002"
S = "${WORKDIR}/geometry-release-release-kinetic-kdl_conversions-1.11.9-0"

inherit catkin
