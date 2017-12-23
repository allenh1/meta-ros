# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "jsk_ik_server"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native cmake-modules mk moveit-msgs roseus rostest tf"
SRC_URI = "https://github.com/tork-a/jsk_control-release/archive/release/kinetic/jsk_ik_server/0.1.13-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "849db7bde1cdc989cb16f4fca3eeed8e"
SRC_URI[sha256sum] = "06b4779fd44da65f9e87950f56263ea14b64b3a05f608fde1fd802797297e656"
S = "${WORKDIR}/jsk_control-release-release-kinetic-jsk_ik_server-0.1.13-0"

inherit catkin
