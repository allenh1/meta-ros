# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Package for TurtleBot3 fake node. With this package, simple tests can be done wi"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "catkin-native geometry-msgs nav-msgs roscpp sensor-msgs std-msgs tf turtlebot3-msgs"
SRC_URI = "https://github.com/ROBOTIS-GIT-release/turtlebot3_simulations-release/archive/release/kinetic/turtlebot3_fake/0.1.7-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "2fc6f0daad30d7dc6ee6b87ce0ec336f"
SRC_URI[sha256sum] = "b15b70f49c557d59bd78ca3a1cbb667accb7e2ff314225210802d9109f2b5e6e"
S = "${WORKDIR}/turtlebot3_simulations-release-release-kinetic-turtlebot3_fake-0.1.7-0"

inherit catkin
