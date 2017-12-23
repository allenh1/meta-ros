# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The industrial message package containes industrial specific messages  	definiti"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native genmsg message-generation message-runtime std-msgs trajectory-msgs"
SRC_URI = "https://github.com/ros-industrial-release/industrial_core-release/archive/release/kinetic/industrial_msgs/0.6.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "75c922cffb96091af3185e39b917773e"
SRC_URI[sha256sum] = "c526d14cdd3d7743dd1e68c56f4671e620a8132b25f50df41eb2f49ff9bae306"
S = "${WORKDIR}/industrial_core-release-release-kinetic-industrial_msgs-0.6.0-0"

inherit catkin
