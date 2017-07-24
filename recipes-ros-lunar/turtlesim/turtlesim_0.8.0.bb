# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "turtlesim is a tool made for teaching ROS and ROS packages."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin geometry-msgs libqt5-core libqt5-gui message-generation message-runtime qt5-qmake qtbase5-dev rosconsole roscpp roscpp-serialization roslib rostime std-msgs std-srvs"
SRC_URI = "https://github.com/ros-gbp/ros_tutorials-release/archive/release/lunar/turtlesim/0.8.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "a894caa50f0d5a5bf4a6ba401800235f"
SRC_URI[sha256sum] = "ae0502f33573619603b38534231d4155fb089a6f76b412f61b3f72e0ecf4320e"
S = "${WORKDIR}/ros_tutorials-release-release-lunar-turtlesim-0.8.0-0"

inherit catkin
