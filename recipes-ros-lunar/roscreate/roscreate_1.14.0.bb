# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "roscreate contains a tool that assists in the creation of ROS filesystem resourc"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin python-rospkg"
SRC_URI = "https://github.com/ros-gbp/ros-release/archive/release/lunar/roscreate/1.14.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "35711a1572a2da848b5ef246fcd62e9a"
SRC_URI[sha256sum] = "c9472bbccfe4ca6e49d65167523a40696cbc434d26434c0dd4ffad01e5fbe68f"
S = "${WORKDIR}/ros-release-release-lunar-roscreate-1.14.0-0"

inherit catkin
