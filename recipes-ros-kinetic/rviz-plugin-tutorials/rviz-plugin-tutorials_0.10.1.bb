# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Tutorials showing how to write plugins for RViz."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native libqt5-core libqt5-gui libqt5-widgets qtbase5-dev rviz"
SRC_URI = "https://github.com/ros-gbp/visualization_tutorials-release/archive/release/kinetic/rviz_plugin_tutorials/0.10.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "7de6134181b395f1c8dab6e49b37f84c"
SRC_URI[sha256sum] = "67be8515890a2c04cb68385c3c73196fa2b8163df80b214c777a3042eb02e171"
S = "${WORKDIR}/visualization_tutorials-release-release-kinetic-rviz_plugin_tutorials-0.10.1-0"

inherit catkin
