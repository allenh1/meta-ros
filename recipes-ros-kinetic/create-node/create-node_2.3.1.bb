# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "iRobot Create ROS driver node          ROS bindings for the Create/Roomba driver"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native create-driver diagnostic-msgs dynamic-reconfigure geometry-msgs message-generation message-runtime nav-msgs python-orocos-kdl rospy tf"
SRC_URI = "https://github.com/turtlebot-release/turtlebot_create-release/archive/release/kinetic/create_node/2.3.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "4d1f0423448e0602e227a391ed249e34"
SRC_URI[sha256sum] = "0d07fac75280d2c2db2845e8a475a6ecd4cfc19959e578c5c8d20db8e6928e59"
S = "${WORKDIR}/turtlebot_create-release-release-kinetic-create_node-2.3.1-0"

inherit catkin
