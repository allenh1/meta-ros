# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Catkin metapackage for the turtlebot_simulator stack"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native turtlebot-gazebo turtlebot-stage turtlebot-stdr"
SRC_URI = "https://github.com/turtlebot-release/turtlebot_simulator-release/archive/release/kinetic/turtlebot_simulator/2.2.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "481dd18d73bd1d902bd8045232e739e0"
SRC_URI[sha256sum] = "85560fb43bae17cb301da06c4c1cb3624f4752d366e75105e741c32f6ece7619"
S = "${WORKDIR}/turtlebot_simulator-release-release-kinetic-turtlebot_simulator-2.2.3-0"

inherit catkin
