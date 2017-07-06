# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "None"
AUTHOR = "OSRF"
SECTION = "devel"
LIC_FILES_CHKSUM = file://package.xml;beginline=8;endline=8;md5=acbed67fd486c51e7a0624505f2e6733"

DEPENDS = "catkin interactive_marker_tutorials librviz_tutorial rviz_plugin_tutorials rviz_python_tutorial visualization_marker_tutorials"
SRC_URI = "https://github.com/ros-gbp/visualization_tutorials-release/archive/release/lunar/visualization_tutorials/0.10.1-0.tar.gz";downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "10ddc5aad53cf2eb4d1fa4b9a9ddf98e"
SRC_URI[sha256sum] = "e6df795104a464e2452c67084025c7aa082016f20a1d3b44a862e0687b781448"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
