# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "turtlebot_calibration"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native geometry-msgs message-generation message-runtime nav-msgs python-orocos-kdl rospy sensor-msgs std-msgs turtlebot-bringup"
SRC_URI = "https://github.com/turtlebot-release/turtlebot_apps-release/archive/release/kinetic/turtlebot_calibration/2.3.7-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "3f3691fd8c9b64c60270f7fea713d888"
SRC_URI[sha256sum] = "aab0b5257acf1a5eb8c0d4831637a61aed61c688fa0da99b6179f55520234174"
S = "${WORKDIR}/turtlebot_apps-release-release-kinetic-turtlebot_calibration-2.3.7-0"

inherit catkin
