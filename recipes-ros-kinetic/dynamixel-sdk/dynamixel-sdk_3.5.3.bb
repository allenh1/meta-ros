# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package is wrapping version of ROBOTIS Dynamxel SDK for ROS. The ROBOTIS Dy"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=82f0323c08605e5b6f343b05213cf7cc"

DEPENDS = "catkin-native roscpp"
SRC_URI = "https://github.com/ROBOTIS-GIT-release/DynamixelSDK-release/archive/release/kinetic/dynamixel_sdk/3.5.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "3af44e113244282ac9403c8679362e16"
SRC_URI[sha256sum] = "a079f82b82bf23191a51ed3a8175dd6db6588b4c0588d719270bc9c56b4c3b97"
S = "${WORKDIR}/DynamixelSDK-release-release-kinetic-dynamixel_sdk-3.5.3-0"

inherit catkin
