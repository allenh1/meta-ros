# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package contains messages for defining shapes, such as simple solid     obj"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native geometry-msgs message-generation message-runtime std-msgs"
SRC_URI = "https://github.com/ros-gbp/common_msgs-release/archive/release/kinetic/shape_msgs/1.12.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "6fbe799b4aa61d8147778c096252a878"
SRC_URI[sha256sum] = "7b99a6ef507932b0a9e9acb73925313539563081c26e90754c9d95c39b12507c"
S = "${WORKDIR}/common_msgs-release-release-kinetic-shape_msgs-1.12.5-0"

inherit catkin
