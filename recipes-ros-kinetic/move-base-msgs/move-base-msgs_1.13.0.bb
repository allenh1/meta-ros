# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Holds the action description and relevant messages for the move_base package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=01c2bc31767ccb3a68e12f02612b2a97"

DEPENDS = "actionlib-msgs catkin-native geometry-msgs message-generation message-runtime"
SRC_URI = "https://github.com/ros-gbp/navigation_msgs-release/archive/release/kinetic/move_base_msgs/1.13.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "db55de5d10aa4a37d5081af5f366b4c0"
SRC_URI[sha256sum] = "6f9cb9261d225727a7e0a9755d8ced29df60668c4a0cb1cb62e474ae0fe307f4"
S = "${WORKDIR}/navigation_msgs-release-release-kinetic-move_base_msgs-1.13.0-0"

inherit catkin
