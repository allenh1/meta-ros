# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Driver for iRobot Create and Roomba          This is a generic driver for iRobot"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=16;endline=16;md5=58e54c03ca7f821dd3967e2a2cd1596e"

DEPENDS = "catkin-native"
SRC_URI = "https://github.com/turtlebot-release/turtlebot_create-release/archive/release/kinetic/create_driver/2.3.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "e263de32452e7e758024b717c426cd27"
SRC_URI[sha256sum] = "afbac7275f72b6fce3b37599413f65fb25cc2470b3e33d82f6d36174ed999297"
S = "${WORKDIR}/turtlebot_create-release-release-kinetic-create_driver-2.3.1-0"

inherit catkin
