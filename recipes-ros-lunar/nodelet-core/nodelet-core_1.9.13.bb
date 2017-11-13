# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Nodelet Core Metapackage"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native nodelet nodelet-topic-tools"
SRC_URI = "https://github.com/ros-gbp/nodelet_core-release/archive/release/lunar/nodelet_core/1.9.13-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "8448eee925e97d7ccff03224335ed60b"
SRC_URI[sha256sum] = "789a64f29c58e63dff54cb6add4f249310ef9c20d7156aab8cb1a796b23842f3"
S = "${WORKDIR}/nodelet_core-release-release-lunar-nodelet_core-1.9.13-0"

inherit catkin
