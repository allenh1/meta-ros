# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "3D model of the TurtleBot3 for simulation and visualization"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "catkin-native urdf xacro"
SRC_URI = "https://github.com/ROBOTIS-GIT-release/turtlebot3-release/archive/release/kinetic/turtlebot3_description/0.1.6-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "09099d63ca4c90328ae91e14d71ef9d3"
SRC_URI[sha256sum] = "95e2f1d10d5898e79b269d00d5b082202e00172bc1697bb872e35abf8aa94df9"
S = "${WORKDIR}/turtlebot3-release-release-kinetic-turtlebot3_description-0.1.6-0"

inherit catkin
