# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "turtle_actionlib demonstrates how to write an action server and client with the "
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib actionlib-msgs angles catkin-native geometry-msgs message-generation message-runtime rosconsole roscpp std-msgs turtlesim"
SRC_URI = "https://github.com/ros-gbp/common_tutorials-release/archive/release/kinetic/turtle_actionlib/0.1.10-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "c9ccd8db2c78bf5c853b810a4c1afc94"
SRC_URI[sha256sum] = "5ec375f3e1c2041fe01e5aede68707d17aa23c97c8e0648469be7f25b2c7c953"
S = "${WORKDIR}/common_tutorials-release-release-kinetic-turtle_actionlib-0.1.10-0"

inherit catkin
