# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "ROS-Package that implements a costmap layer to add prohibited areas to the costm"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native costmap-2d dynamic-reconfigure roscpp"
SRC_URI = "https://github.com/rst-tu-dortmund/costmap_prohibition_layer-release/archive/release/kinetic/costmap_prohibition_layer/0.0.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "e0b882111329d93eee7e47a9dbc4c427"
SRC_URI[sha256sum] = "249a5d7b9bbd812905db2e734dd6ecdf38f35db27d615af06a816734f3ccc4c6"
S = "${WORKDIR}/costmap_prohibition_layer-release-release-kinetic-costmap_prohibition_layer-0.0.5-0"

inherit catkin
