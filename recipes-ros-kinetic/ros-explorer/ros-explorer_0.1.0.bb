# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A web interface for exploring the ROS graph"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native rosbridge-server rospy"
SRC_URI = "https://github.com/jstnhuang-release/ros_explorer-release/archive/release/kinetic/ros_explorer/0.1.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "2cd9806d09f4b7c088e73b9b2bb12bb7"
SRC_URI[sha256sum] = "5a013b0dc326164b64d471ef26402079a0af66bbd5132dd43725c299b2867595"
S = "${WORKDIR}/ros_explorer-release-release-kinetic-ros_explorer-0.1.0-0"

inherit catkin
