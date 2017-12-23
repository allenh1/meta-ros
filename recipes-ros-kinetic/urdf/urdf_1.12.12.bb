# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package contains a C++ parser for the Unified Robot Description     Format "
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=16;endline=16;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native cmake-modules liburdfdom-dev liburdfdom-headers-dev pluginlib rosconsole-bridge roscpp libtinyxml urdf-parser-plugin"
SRC_URI = "https://github.com/ros-gbp/${PN}-release/archive/release/kinetic/${PN}/1.12.12-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "62ef79bfbeb4e9ed7b9f9242b9a94af9"
SRC_URI[sha256sum] = "3ef94e4c96e189e1df3b4e57d0309bd1bd76a7a28a674a5944e26b8fd674cb33"
S = "${WORKDIR}/${PN}-release-release-kinetic-${PN}-1.12.12-0"

inherit catkin
