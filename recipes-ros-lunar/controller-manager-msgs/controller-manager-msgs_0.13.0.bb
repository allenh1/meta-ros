# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Messages and services for the controller manager."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native message-generation message-runtime std-msgs"
SRC_URI = "https://github.com/ros-gbp/ros_control-release/archive/release/lunar/controller_manager_msgs/0.13.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "bb22d238c93d4276b5cb2e4223af9b4f"
SRC_URI[sha256sum] = "451bf4471734ad6fd8c08873a49eeb9c89cc9c6eb1047a9e46ab35c1a6621758"
S = "${WORKDIR}/ros_control-release-release-lunar-controller_manager_msgs-0.13.0-0"

inherit catkin
