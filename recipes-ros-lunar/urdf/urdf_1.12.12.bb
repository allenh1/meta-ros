# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package contains a C++ parser for the Unified Robot Description     Format "
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=16;endline=16;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native cmake-modules liburdfdom-dev liburdfdom-headers-dev pluginlib rosconsole-bridge roscpp libtinyxml urdf-parser-plugin"
SRC_URI = "https://github.com/ros-gbp/${PN}-release/archive/release/lunar/${PN}/1.12.12-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "90d5ad4441a6a750c1b99c0e038775bb"
SRC_URI[sha256sum] = "215d05cb557935c5e9f60a34278d34cb12729efcdecf15e2029b91d9d7952999"
S = "${WORKDIR}/${PN}-release-release-lunar-${PN}-1.12.12-0"

inherit catkin
