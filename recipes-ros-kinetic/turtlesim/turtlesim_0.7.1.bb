# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "turtlesim is a tool made for teaching ROS and ROS packages."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native geometry-msgs libqt5-core libqt5-gui message-generation message-runtime qt5-qmake qtbase5-dev rosconsole roscpp roscpp-serialization roslib rostime std-msgs std-srvs"
SRC_URI = "https://github.com/ros-gbp/ros_tutorials-release/archive/release/kinetic/${PN}/0.7.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "f9d07304a4eb51bb71726c3579ea5eae"
SRC_URI[sha256sum] = "bd56f38a94dee0c7142361c48f56a1bee0bb69d98f238ee9d4be29ddf7098cd6"
S = "${WORKDIR}/ros_tutorials-release-release-kinetic-${PN}-0.7.1-0"

inherit catkin
