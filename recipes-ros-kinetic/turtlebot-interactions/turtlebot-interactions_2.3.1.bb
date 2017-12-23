# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Catkin meta-package for turtlebot_interactions"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native turtlebot-dashboard turtlebot-interactive-markers turtlebot-rviz-launchers"
SRC_URI = "https://github.com/turtlebot-release/turtlebot_interactions-release/archive/release/kinetic/turtlebot_interactions/2.3.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "93dd4f2f8b66586605e528331ca3d10d"
SRC_URI[sha256sum] = "163443fc9b56c33c01d0f76b879a1730fbb903cdd5ef6d53bece3cc38e0fa195"
S = "${WORKDIR}/turtlebot_interactions-release-release-kinetic-turtlebot_interactions-2.3.1-0"

inherit catkin
