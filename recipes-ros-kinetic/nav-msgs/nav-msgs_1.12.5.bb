# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "nav_msgs defines the common messages used to interact with the      stack."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib-msgs catkin-native geometry-msgs message-generation message-runtime std-msgs"
SRC_URI = "https://github.com/ros-gbp/common_msgs-release/archive/release/kinetic/nav_msgs/1.12.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "a77bf0e5728f988277d85450d9555403"
SRC_URI[sha256sum] = "081c636f032385d4982b250b3dae6e1176d328d7c3ad59a40e547701a77b2a0b"
S = "${WORKDIR}/common_msgs-release-release-kinetic-nav_msgs-1.12.5-0"

inherit catkin
