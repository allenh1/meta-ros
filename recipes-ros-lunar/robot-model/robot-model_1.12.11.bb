# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "contains packages for modeling various     aspects of robot information, specifi"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=17;endline=17;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin collada-parser collada-urdf joint-state-publisher kdl-parser liburdfdom-tools resource-retriever urdf urdf-parser-plugin"
SRC_URI = "https://github.com/ros-gbp/robot_model-release/archive/release/lunar/robot_model/1.12.11-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "4584376cb3ae7f898618ebeacaee7527"
SRC_URI[sha256sum] = "0c2b36a12518adfb90c4fa3a662ab3432e01f92a234b222e8bdea3ccbdfb0929"
S = "${WORKDIR}/robot_model-release-release-lunar-robot_model-1.12.11-0"

inherit catkin
