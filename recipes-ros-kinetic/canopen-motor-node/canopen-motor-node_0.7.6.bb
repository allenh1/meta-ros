# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package extends the canopen_chain_node with specialized handling for canope"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "LGPL-3"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=b691248d2f70cdaeeaf13696ada5d47c"

DEPENDS = "canopen-402 canopen-chain-node catkin-native controller-manager controller-manager-msgs filters hardware-interface joint-limits-interface muparser urdf"
SRC_URI = "https://github.com/ros-industrial-release/ros_canopen-release/archive/release/kinetic/canopen_motor_node/0.7.6-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "fff46c57d817f104ce3e2ce5bfb63563"
SRC_URI[sha256sum] = "ae42b1f1803068050977a6324a91fd5336a82302591ded5b236882a45516501b"
S = "${WORKDIR}/ros_canopen-release-release-kinetic-canopen_motor_node-0.7.6-0"

inherit catkin
