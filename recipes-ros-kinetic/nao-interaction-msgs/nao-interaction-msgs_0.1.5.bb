# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Messages and services declarations for the nao_interaction metapackage"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib-msgs catkin-native geometry-msgs message-generation message-runtime nav-msgs sensor-msgs std-msgs trajectory-msgs"
SRC_URI = "https://github.com/ros-naoqi/nao_interaction-release/archive/release/kinetic/nao_interaction_msgs/0.1.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "e6c25a3122aa5d73fe2ef1b8f9c9685e"
SRC_URI[sha256sum] = "6b90c6d03ec17b537f17adcc358ac7e2373f6383a09f5e70d0bc4f52c30b7715"
S = "${WORKDIR}/nao_interaction-release-release-kinetic-nao_interaction_msgs-0.1.5-0"

inherit catkin
