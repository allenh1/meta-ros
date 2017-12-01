# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A generic canopen implementation for ROS"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "LGPL"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=46ee8693f40a89a31023e97ae17ecf19"

DEPENDS = "can-msgs canopen-402 canopen-chain-node canopen-master canopen-motor-node catkin-native socketcan-bridge socketcan-interface"
SRC_URI = "https://github.com/ros-industrial-release/ros_canopen-release/archive/release/lunar/ros_canopen/0.7.6-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "2499da5d28beb8209d7ddb2d50ec9747"
SRC_URI[sha256sum] = "1fd065a5c9af43bd40ebb5a5340377709898a61970f07ecd9742435f2f07f8c1"
S = "${WORKDIR}/ros_canopen-release-release-lunar-ros_canopen-0.7.6-0"

inherit catkin
