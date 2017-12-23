# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Tutorials showing how to write plugins for RViz."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native catkin libqt5-core libqt5-gui libqt5-widgets qtbase5-dev rviz"
SRC_URI = "https://github.com/ros-gbp/visualization_tutorials-release/archive/release/lunar/rviz_plugin_tutorials/0.10.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "2d31d6a76813321168ac39dd5a3d6037"
SRC_URI[sha256sum] = "2dec99d78042648ea65de6dd17f48b7505f52af4e595fe02310db1b6f4de8b32"
S = "${WORKDIR}/visualization_tutorials-release-release-lunar-rviz_plugin_tutorials-0.10.1-0"

inherit catkin
