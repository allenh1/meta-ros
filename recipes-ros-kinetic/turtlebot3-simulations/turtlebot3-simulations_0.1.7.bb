# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "ROS packages for the turtlebot3 simulation (meta package)"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "catkin-native turtlebot3-fake turtlebot3-gazebo"
SRC_URI = "https://github.com/ROBOTIS-GIT-release/turtlebot3_simulations-release/archive/release/kinetic/turtlebot3_simulations/0.1.7-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "6b757f691a18fb930fb737b738259bda"
SRC_URI[sha256sum] = "c8a01edb50d2c094b06d1554d972af69c0e466cf31fdecc155983539919b3111"
S = "${WORKDIR}/turtlebot3_simulations-release-release-kinetic-turtlebot3_simulations-0.1.7-0"

inherit catkin
