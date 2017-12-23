# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The marker_rviz_plugin package contains RViz plugins to visualize messages of th"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native marker-msgs roscpp rviz"
SRC_URI = "https://github.com/tuw-robotics/marker_rviz_plugin-release/archive/release/kinetic/marker_rviz_plugin/0.0.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "94304d2eddd87508cf2bde625721b5c9"
SRC_URI[sha256sum] = "bc621e2650d55f3082e262b8c305d1343d89984f89a7b1afd26ae2d236b23703"
S = "${WORKDIR}/marker_rviz_plugin-release-release-kinetic-marker_rviz_plugin-0.0.2-0"

inherit catkin
