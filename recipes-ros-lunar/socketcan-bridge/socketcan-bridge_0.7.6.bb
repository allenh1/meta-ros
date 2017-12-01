# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Provides nodes to convert messages from SocketCAN to a ROS Topic and vice versa."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "can-msgs catkin-native roscpp socketcan-interface"
SRC_URI = "https://github.com/ros-industrial-release/ros_canopen-release/archive/release/lunar/socketcan_bridge/0.7.6-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "85ae30074e524b3dd4beacb390491bb4"
SRC_URI[sha256sum] = "6c16ce9bef04a9ebfc6fafcdb12f4d3e8f5aefbc94b083133e12a32fb4474e0f"
S = "${WORKDIR}/ros_canopen-release-release-lunar-socketcan_bridge-0.7.6-0"

inherit catkin
