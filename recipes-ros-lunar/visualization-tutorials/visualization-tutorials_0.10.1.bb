# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Metapackage referencing tutorials related to rviz and visualization."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=01c2bc31767ccb3a68e12f02612b2a97"

DEPENDS = "python-empy-native interactive-marker-tutorials librviz-tutorial rviz-plugin-tutorials rviz-python-tutorial visualization-marker-tutorials"
SRC_URI = "https://github.com/ros-gbp/visualization_tutorials-release/archive/release/lunar/visualization_tutorials/0.10.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "10ddc5aad53cf2eb4d1fa4b9a9ddf98e"
SRC_URI[sha256sum] = "e6df795104a464e2452c67084025c7aa082016f20a1d3b44a862e0687b781448"
S = "${WORKDIR}/visualization_tutorials-release-release-lunar-visualization_tutorials-0.10.1-0"

inherit catkin
