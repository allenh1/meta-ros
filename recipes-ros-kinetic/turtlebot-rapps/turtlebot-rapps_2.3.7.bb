# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The core set of turtlebot 'app manager' apps are defined in this package."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native compressed-image-transport kobuki-auto-docking robot-pose-publisher tf topic-tools turtlebot-bringup turtlebot-follower turtlebot-navigation turtlebot-teleop warehouse-ros world-canvas-server"
SRC_URI = "https://github.com/turtlebot-release/turtlebot_apps-release/archive/release/kinetic/turtlebot_rapps/2.3.7-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "8727245b2b62babfedc0d24b06a7bed8"
SRC_URI[sha256sum] = "37e69eea152bfc4abe1d1a80e95e2143eb7614035397d66ae39880ba2c4e90cd"
S = "${WORKDIR}/turtlebot_apps-release-release-kinetic-turtlebot_rapps-2.3.7-0"

inherit catkin
