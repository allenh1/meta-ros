# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A generic canopen implementation for ROS"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "LGPL"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d2740cd2c4139b24d7392872077c634a"

DEPENDS = "can-msgs canopen-402 canopen-chain-node canopen-master canopen-motor-node catkin socketcan-bridge socketcan-interface"
SRC_URI = "https://github.com/ros-industrial-release/ros_canopen-release/archive/release/lunar/ros_canopen/0.7.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "53277d59f33a8b8ebf68b97e650897df"
SRC_URI[sha256sum] = "30b0f0a2fe65f4ea93b956964587a145f24e43b332539110801978763c45137e"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
