# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A generic canopen implementation for ROS"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "LGPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=46ee8693f40a89a31023e97ae17ecf19"

DEPENDS = "can-msgs canopen-402 canopen-chain-node canopen-master canopen-motor-node catkin-native socketcan-bridge socketcan-interface"
SRC_URI = "https://github.com/ros-industrial-release/ros_canopen-release/archive/release/kinetic/ros_canopen/0.7.6-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "e52db6ef6ce8da67049f9384f332a168"
SRC_URI[sha256sum] = "366739345d89274bf922101292772d2b4e13680945a85276421fc86025b54979"
S = "${WORKDIR}/ros_canopen-release-release-kinetic-ros_canopen-0.7.6-0"

inherit catkin
