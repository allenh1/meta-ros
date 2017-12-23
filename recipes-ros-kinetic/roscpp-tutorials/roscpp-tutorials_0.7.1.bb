# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package attempts to show the features of ROS step-by-step,     including us"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native message-generation message-runtime rosconsole roscpp roscpp-serialization rostime std-msgs"
SRC_URI = "https://github.com/ros-gbp/ros_tutorials-release/archive/release/kinetic/roscpp_tutorials/0.7.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "87184571e856c31bde74cd7b8da6116e"
SRC_URI[sha256sum] = "f7650f9a85250adc854ef4d01bfd2376cbb4a5778f451fb8aa2ec63481756d95"
S = "${WORKDIR}/ros_tutorials-release-release-kinetic-roscpp_tutorials-0.7.1-0"

inherit catkin
