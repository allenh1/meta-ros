# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "ROS node base implementation for CANopen chains with support for management serv"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "LGPL-3"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=b691248d2f70cdaeeaf13696ada5d47c"

DEPENDS = "canopen-master catkin-native diagnostic-updater message-generation message-runtime pluginlib roscpp roslib socketcan-interface std-msgs std-srvs"
SRC_URI = "https://github.com/ros-industrial-release/ros_canopen-release/archive/release/kinetic/canopen_chain_node/0.7.6-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "444bf39e2cef3db2fdb0497d7f72737c"
SRC_URI[sha256sum] = "68ee0b56849887f1bc64512fd33ab54e394e9f1ef8efdc2732b5c3c9149cf4f7"
S = "${WORKDIR}/ros_canopen-release-release-kinetic-canopen_chain_node-0.7.6-0"

inherit catkin
