# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package extends the canopen_chain_node with specialized handling for canope"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "LGPLv3"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=b691248d2f70cdaeeaf13696ada5d47c"

DEPENDS = "canopen-402 canopen-chain-node catkin controller-manager controller-manager-msgs filters hardware-interface joint-limits-interface muparser urdf"
SRC_URI = "https://github.com/ros-industrial-release/ros_canopen-release/archive/release/lunar/canopen_motor_node/0.7.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "0168f28180b6d7d48946a031aac753ab"
SRC_URI[sha256sum] = "3039dfd16ce24f8ef935d7a268472e225b5f566d39017e2ce7a04394154ceb40"
S = "${WORKDIR}/ros_canopen-release-release-lunar-canopen_motor_node-0.7.5-0"

inherit catkin
