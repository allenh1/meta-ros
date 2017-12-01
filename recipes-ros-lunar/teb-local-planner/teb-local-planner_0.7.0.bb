# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The teb_local_planner package implements a plugin     to the base_local_planner "
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=16;endline=16;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "base-local-planner catkin-native cmake-modules costmap-2d costmap-converter dynamic-reconfigure geometry-msgs interactive-markers libg2o message-generation message-runtime nav-core nav-msgs pluginlib roscpp std-msgs tf tf-conversions visualization-msgs"
SRC_URI = "https://github.com/rst-tu-dortmund/teb_local_planner-release/archive/release/lunar/teb_local_planner/0.7.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "e4d8c0d0d6b4260794506dc3871b440d"
SRC_URI[sha256sum] = "51c91a65e5216124b934fe76207b7ac5ff08548c6714b3f0eae560d634db2001"
S = "${WORKDIR}/teb_local_planner-release-release-lunar-teb_local_planner-0.7.0-0"

inherit catkin
