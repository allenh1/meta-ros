# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "simple_message defines a simple messaging connection and protocol for communicat"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native industrial-msgs roscpp"
SRC_URI = "https://github.com/ros-industrial-release/industrial_core-release/archive/release/kinetic/simple_message/0.6.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "8238dfb1c77109a22a83b76186ac439c"
SRC_URI[sha256sum] = "76ad4927f7f1139bd56dbf007309a7ce8046477dfb3aaeecc5a5f140f4072dee"
S = "${WORKDIR}/industrial_core-release-release-kinetic-simple_message-0.6.0-0"

inherit catkin
