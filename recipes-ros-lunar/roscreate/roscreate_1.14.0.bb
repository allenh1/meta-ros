# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "roscreate contains a tool that assists in the creation of ROS filesystem resourc"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=1;endline=1;md5=ca2e63748a6679671416c4c20c478ca4"

DEPENDS = "catkin python-rospkg"
SRC_URI = "https://github.com/ros-gbp/ros-release/archive/release/lunar/roscreate/1.14.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "35711a1572a2da848b5ef246fcd62e9a"
SRC_URI[sha256sum] = "c9472bbccfe4ca6e49d65167523a40696cbc434d26434c0dd4ffad01e5fbe68f"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
