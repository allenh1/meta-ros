# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A generic canopen implementation for ROS"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "LGPL"
LIC_FILES_CHKSUM = "file://package.xml;beginline=1;endline=1;md5=56ceb873207ff612960f98da5f377178"

DEPENDS = "can_msgs canopen_402 canopen_chain_node canopen_master canopen_motor_node catkin socketcan_bridge socketcan_interface"
SRC_URI = "https://github.com/ros-industrial-release/ros_canopen-release/archive/release/lunar/ros_canopen/0.7.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "53277d59f33a8b8ebf68b97e650897df"
SRC_URI[sha256sum] = "30b0f0a2fe65f4ea93b956964587a145f24e43b332539110801978763c45137e"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
