# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "turtlebot_apps is a group of simple demos and exmaples to run on your TurtleBot "
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native turtlebot-actions turtlebot-calibration turtlebot-follower turtlebot-navigation turtlebot-rapps"
SRC_URI = "https://github.com/turtlebot-release/turtlebot_apps-release/archive/release/kinetic/turtlebot_apps/2.3.7-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "edcca768f0c0a0b95a1a94bf713415aa"
SRC_URI[sha256sum] = "e6f717d30a6035fce7aec2c9c4fa0713f0205d0b0a7ef21c834f4a658f5a79c9"
S = "${WORKDIR}/turtlebot_apps-release-release-kinetic-turtlebot_apps-2.3.7-0"

inherit catkin
