# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Catkin metapackage for the turtlebot_create stack"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native create-description create-driver create-node"
SRC_URI = "https://github.com/turtlebot-release/turtlebot_create-release/archive/release/kinetic/turtlebot_create/2.3.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "87beccf2bc3f209d79413982e3d20a47"
SRC_URI[sha256sum] = "5de6720c110be9b0f441d36039c111fe86fe7b4b77e51d7d0c91df67bb23c342"
S = "${WORKDIR}/turtlebot_create-release-release-kinetic-turtlebot_create-2.3.1-0"

inherit catkin
