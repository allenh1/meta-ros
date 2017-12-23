# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package contains a C++ base class for URDF parsers."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native liburdfdom-headers-dev"
SRC_URI = "https://github.com/ros-gbp/urdf-release/archive/release/kinetic/urdf_parser_plugin/1.12.12-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "fb458739935e448540e91be6056004c7"
SRC_URI[sha256sum] = "8c3407882b0c5e3dd1ad56ec5c1321c2db117c6eccdf49f93d1c4d29357fdbcf"
S = "${WORKDIR}/urdf-release-release-kinetic-urdf_parser_plugin-1.12.12-0"

inherit catkin
