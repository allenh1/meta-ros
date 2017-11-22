# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "roscpp_traits contains the message traits code as described in     .      This p"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin cpp-common rostime"
SRC_URI = "https://github.com/ros-gbp/roscpp_core-release/archive/release/lunar/roscpp_traits/0.6.7-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "7d9b457d51b551a6a89db989ac081f40"
SRC_URI[sha256sum] = "7a6969acdce39e4ce3282a577629f8a5fa00826f59570ee8c2bf1ce8009566dc"
S = "${WORKDIR}/roscpp_core-release-release-lunar-roscpp_traits-0.6.7-0"

inherit catkin
