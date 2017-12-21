# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package extends the canopen_chain_node with specialized handling for canope"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "LGPL-3"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=b691248d2f70cdaeeaf13696ada5d47c"

DEPENDS = "canopen-402 canopen-chain-node catkin-native controller-manager controller-manager-msgs filters hardware-interface joint-limits-interface muparser urdf"
SRC_URI = "https://github.com/ros-industrial-release/ros_canopen-release/archive/release/lunar/canopen_motor_node/0.7.6-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "5e95a6b9a9515c40da1968feba603df7"
SRC_URI[sha256sum] = "62b0b3e7ee2b29b9a83f620e218a3371cb674e177bc9975924521ed9f5f0810a"
S = "${WORKDIR}/ros_canopen-release-release-lunar-canopen_motor_node-0.7.6-0"

inherit catkin
