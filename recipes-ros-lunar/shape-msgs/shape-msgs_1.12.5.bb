# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package contains messages for defining shapes, such as simple solid     obj"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "python-empy-native geometry-msgs message-generation message-runtime std-msgs"
SRC_URI = "https://github.com/ros-gbp/common_msgs-release/archive/release/lunar/shape_msgs/1.12.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "1597985cf84ba078cc73992057d1f8a3"
SRC_URI[sha256sum] = "53f264c2bbe19c55c56ed25731b3da0a63dbc7b79f111aeb740cb2348f190595"
S = "${WORKDIR}/common_msgs-release-release-lunar-shape_msgs-1.12.5-0"

inherit catkin
