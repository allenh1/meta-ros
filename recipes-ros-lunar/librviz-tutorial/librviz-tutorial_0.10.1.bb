# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Tutorial showing how to compile your own C++ program with RViz displays and feat"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native libqt5-core libqt5-gui libqt5-widgets qtbase5-dev roscpp rviz"
SRC_URI = "https://github.com/ros-gbp/visualization_tutorials-release/archive/release/lunar/librviz_tutorial/0.10.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "eb9bf01b5b315120bb9ae118e710aba3"
SRC_URI[sha256sum] = "eadb053a95d02a96395e72601da9aaaee102792e176f4436cd6d300e7e231212"
S = "${WORKDIR}/visualization_tutorials-release-release-lunar-librviz_tutorial-0.10.1-0"

inherit catkin
