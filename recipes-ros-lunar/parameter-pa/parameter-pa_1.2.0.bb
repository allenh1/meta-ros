# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "ProAut parameter package"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=01c2bc31767ccb3a68e12f02612b2a97"

DEPENDS = "catkin-native catkin cmake-modules eigen message-generation message-runtime roscpp roslib"
SRC_URI = "https://github.com/peterweissig/ros_parameter-release/archive/release/lunar/parameter_pa/1.2.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "83ee78a0d4687ee80dc0e0e517c93ca9"
SRC_URI[sha256sum] = "e3535529e4c062a8355d4280f5c7e91d66f3cefd705925c81a3d9d3a64e5f133"
S = "${WORKDIR}/ros_parameter-release-release-lunar-parameter_pa-1.2.0-0"

inherit catkin
