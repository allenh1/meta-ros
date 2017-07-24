# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "ROS node base implementation for CANopen chains with support for management serv"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "LGPLv3"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=b691248d2f70cdaeeaf13696ada5d47c"

DEPENDS = "canopen-master catkin diagnostic-updater message-generation message-runtime pluginlib roscpp roslib socketcan-interface std-msgs std-srvs"
SRC_URI = "https://github.com/ros-industrial-release/ros_canopen-release/archive/release/lunar/canopen_chain_node/0.7.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "d216abed173020f2638630bc26e4e587"
SRC_URI[sha256sum] = "b2239f4b3d689595b8554c7a4aa01bc15ebb3c08aebdfce690b4eead67f9bdcd"
S = "${WORKDIR}/ros_canopen-release-release-lunar-canopen_chain_node-0.7.5-0"

inherit catkin
