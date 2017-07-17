# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "voxel_grid provides an implementation of an efficient 3D voxel grid. The occupan"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=;endline=;md5="

DEPENDS = "catkin roscpp"
SRC_URI = "https://github.com/ros-gbp/navigation-release/archive/release/lunar/voxel_grid/1.14.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "348d12521583cf0b5738db439e1ce0c3"
SRC_URI[sha256sum] = "a8361b02adf1c5f8948ad92e24cbd2bd3ab3de3f391905a4f670f7a48d4da552"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
