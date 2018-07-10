# Copyright 2018 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Standard ROS Messages including common message types representing primitive data types and other basic message constructs, such as multiarrays.     For common, generic robot-specific message types, please see <a href="http://www.ros.org/wiki/common_msgs">common_msgs</a>."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "kinetic"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native catkin message-generation message-runtime"
SRC_URI = "https://github.com/ros-gbp/std_msgs-release/archive/release/kinetic/std_msgs/0.5.11-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "71f7ccf7693e3c99932de4beb3a4f889"
SRC_URI[sha256sum] = "64d894cdc86fba346136f61ee98b638f1cbc92eb8a58dadb74ee15bea21b9d70"
S = "${WORKDIR}/std_msgs-release-release-kinetic-std_msgs-0.5.11-0"

inherit catkin
