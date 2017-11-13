# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "ROS node base implementation for CANopen chains with support for management serv"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "LGPLv3"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=b691248d2f70cdaeeaf13696ada5d47c"

DEPENDS = "canopen-master catkin-native diagnostic-updater message-generation message-runtime pluginlib roscpp roslib socketcan-interface std-msgs std-srvs"
SRC_URI = "https://github.com/ros-industrial-release/ros_canopen-release/archive/release/lunar/canopen_chain_node/0.7.6-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "e517eef5550864bd5d1620b05b69f11b"
SRC_URI[sha256sum] = "4fc07e3a181b205fb5b465f6fa6651c6f5fa0ed26409d1d38fa5f10c513b1f72"
S = "${WORKDIR}/ros_canopen-release-release-lunar-canopen_chain_node-0.7.6-0"

inherit catkin
