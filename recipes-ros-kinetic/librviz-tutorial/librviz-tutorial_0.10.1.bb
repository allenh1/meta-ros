# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Tutorial showing how to compile your own C++ program with RViz displays and feat"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native libqt5-core libqt5-gui libqt5-widgets qtbase5-dev roscpp rviz"
SRC_URI = "https://github.com/ros-gbp/visualization_tutorials-release/archive/release/kinetic/librviz_tutorial/0.10.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "962434ae813405803134781ef8cd026a"
SRC_URI[sha256sum] = "b8da59e4ac9d02ac07e9f737154279dba96b95700f042dccb261a2b9d7ea6b7a"
S = "${WORKDIR}/visualization_tutorials-release-release-kinetic-librviz_tutorial-0.10.1-0"

inherit catkin
