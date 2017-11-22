# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "turtlesim is a tool made for teaching ROS and ROS packages."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin geometry-msgs libqt5-core libqt5-gui message-generation message-runtime qt5-qmake qtbase5-dev rosconsole roscpp roscpp-serialization roslib rostime std-msgs std-srvs"
SRC_URI = "https://github.com/ros-gbp/ros_tutorials-release/archive/release/lunar/turtlesim/0.8.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "a060129112e334c4a3fc476c5d0a79af"
SRC_URI[sha256sum] = "ce15b5cb9dd8c7b43bd5082bd62f713e09fdc55d0bcb081fd462df88e14fda1f"
S = "${WORKDIR}/ros_tutorials-release-release-lunar-turtlesim-0.8.1-0"

inherit catkin
