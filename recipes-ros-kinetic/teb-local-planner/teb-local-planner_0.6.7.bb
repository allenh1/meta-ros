# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The teb_local_planner package implements a plugin     to the base_local_planner "
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=16;endline=16;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "base-local-planner catkin-native cmake-modules costmap-2d costmap-converter dynamic-reconfigure geometry-msgs interactive-markers libg2o message-generation message-runtime nav-core nav-msgs pluginlib roscpp std-msgs tf tf-conversions visualization-msgs"
SRC_URI = "https://github.com/rst-tu-dortmund/teb_local_planner-release/archive/release/kinetic/teb_local_planner/0.6.7-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "1088fd60d8ab5f418fd8bc5892a07851"
SRC_URI[sha256sum] = "df604a1ed0ef9865e3dc4b48d4604674e17847991c858de3a72e0ec94e865fbe"
S = "${WORKDIR}/teb_local_planner-release-release-kinetic-teb_local_planner-0.6.7-0"

inherit catkin
