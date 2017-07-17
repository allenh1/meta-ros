# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Package modeling the run-time dependencies for language bindings of messages."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=23f8de2430b349800266ded71351769e"

DEPENDS = "catkin cpp_common genpy roscpp_serialization roscpp_traits rostime"
SRC_URI = "https://github.com/ros-gbp/message_runtime-release/archive/release/lunar/message_runtime/0.4.12-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "60025242dfd0e30fc99d5f65b4fce159"
SRC_URI[sha256sum] = "dd6efff27eb4f5a02ec9cf1120c9b502abbd0f741caa57b4b3cdcc6b1ca21763"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
