# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "turtlesim is a tool made for teaching ROS and ROS packages."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=1;endline=1;md5=d91dc7124d510c34fbdbd3ddfe3eeea6"

DEPENDS = "catkin geometry_msgs libqt5-core libqt5-gui message_generation message_runtime qt5-qmake qtbase5-dev rosconsole roscpp roscpp_serialization roslib rostime std_msgs std_srvs"
SRC_URI = "https://github.com/ros-gbp/ros_tutorials-release/archive/release/lunar/turtlesim/0.8.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "a894caa50f0d5a5bf4a6ba401800235f"
SRC_URI[sha256sum] = "ae0502f33573619603b38534231d4155fb089a6f76b412f61b3f72e0ecf4320e"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
