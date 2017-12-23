# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Model description for the iRobot Create"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native urdf xacro"
SRC_URI = "https://github.com/turtlebot-release/turtlebot_create-release/archive/release/kinetic/create_description/2.3.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "0b46c9e79be9145abd6d48e457f4519c"
SRC_URI[sha256sum] = "3ea31a8af2614e2017e9ddf7e8ec52d583387da1ddf08f01a2785dc7c59bdad1"
S = "${WORKDIR}/turtlebot_create-release-release-kinetic-create_description-2.3.1-0"

inherit catkin
