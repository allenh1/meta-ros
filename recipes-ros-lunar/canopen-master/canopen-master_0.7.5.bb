# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "CiA(r) CANopen 301 master implementation with support for interprocess master sy"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "LGPLv3"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=b691248d2f70cdaeeaf13696ada5d47c"

DEPENDS = "boost catkin-native class-loader socketcan-interface"
SRC_URI = "https://github.com/ros-industrial-release/ros_canopen-release/archive/release/lunar/canopen_master/0.7.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "8529299eb41df3ac57ef3a398095faa0"
SRC_URI[sha256sum] = "1cc60c971e7c7c11f1922cfee503d27c93193c823c0ddcb2894ce18f15c216fb"
S = "${WORKDIR}/ros_canopen-release-release-lunar-canopen_master-0.7.5-0"

inherit catkin
