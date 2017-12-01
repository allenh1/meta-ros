# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "CiA(r) CANopen 301 master implementation with support for interprocess master sy"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "LGPLv3"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=b691248d2f70cdaeeaf13696ada5d47c"

DEPENDS = "boost catkin-native class-loader socketcan-interface"
SRC_URI = "https://github.com/ros-industrial-release/ros_canopen-release/archive/release/lunar/canopen_master/0.7.6-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "c597acc7b8b1989641e1c0e3f831235f"
SRC_URI[sha256sum] = "76ff8b70da5d1f42f3a84adc51759f336496549a32955ef2e5543ce8735b9459"
S = "${WORKDIR}/ros_canopen-release-release-lunar-canopen_master-0.7.6-0"

inherit catkin
