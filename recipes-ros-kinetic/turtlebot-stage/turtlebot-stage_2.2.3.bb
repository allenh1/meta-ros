# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Stage version of turtlebot simulation. Convenient to test 2D-navigation related "
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native navigation stage-ros turtlebot-bringup turtlebot-navigation yocs-velocity-smoother yocs-virtual-sensor"
SRC_URI = "https://github.com/turtlebot-release/turtlebot_simulator-release/archive/release/kinetic/turtlebot_stage/2.2.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "3d1310bce336063ebe56b52d767bef12"
SRC_URI[sha256sum] = "b71fa130c001a758087f1a0f6df2521ab3d2129a9a053ed7d60894ad3e99c462"
S = "${WORKDIR}/turtlebot_simulator-release-release-kinetic-turtlebot_stage-2.2.3-0"

inherit catkin
