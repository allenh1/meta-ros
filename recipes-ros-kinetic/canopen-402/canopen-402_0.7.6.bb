# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This implements the CANopen device profile for drives and motion control. CiA(r)"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "LGPL-3"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=b691248d2f70cdaeeaf13696ada5d47c"

DEPENDS = "canopen-master catkin-native class-loader"
SRC_URI = "https://github.com/ros-industrial-release/ros_canopen-release/archive/release/kinetic/canopen_402/0.7.6-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "32531f02d65d06c007ad0085deacc353"
SRC_URI[sha256sum] = "ca2129a21f4ac722bdd8c4f545e508c922319e41035fa98bbc71a0a07a92265a"
S = "${WORKDIR}/ros_canopen-release-release-kinetic-canopen_402-0.7.6-0"

inherit catkin
