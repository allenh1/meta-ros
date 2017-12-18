# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Nodelet Core Metapackage"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native catkin nodelet nodelet-topic-tools"
SRC_URI = "https://github.com/ros-gbp/nodelet_core-release/archive/release/lunar/nodelet_core/1.9.14-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "6e85b0fb2c7df8f3b56eeb40e82c97c6"
SRC_URI[sha256sum] = "e3f77a7244142c6dd61e9f62b4716cd7bebf8be665c0586482b7fc4a43426779"
S = "${WORKDIR}/nodelet_core-release-release-lunar-nodelet_core-1.9.14-0"

inherit catkin
