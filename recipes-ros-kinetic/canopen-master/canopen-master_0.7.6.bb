# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "CiA(r) CANopen 301 master implementation with support for interprocess master sy"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "LGPL-3"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=b691248d2f70cdaeeaf13696ada5d47c"

DEPENDS = "boost catkin-native class-loader socketcan-interface"
SRC_URI = "https://github.com/ros-industrial-release/ros_canopen-release/archive/release/kinetic/canopen_master/0.7.6-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "b54b5ff37f0a7ca13c66b2c168c6f472"
SRC_URI[sha256sum] = "510eadc291ac646363c318493fc0621888dccd6a251d4d4410330f01e977bee5"
S = "${WORKDIR}/ros_canopen-release-release-kinetic-canopen_master-0.7.6-0"

inherit catkin
