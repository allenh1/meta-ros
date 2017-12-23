# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Gazebo simulation package for the TurtleBot3"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "catkin-native gazebo-ros geometry-msgs nav-msgs roscpp sensor-msgs std-msgs tf"
SRC_URI = "https://github.com/ROBOTIS-GIT-release/turtlebot3_simulations-release/archive/release/kinetic/turtlebot3_gazebo/0.1.7-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "6ead6e6f1d063b75eff231f2625bcf8a"
SRC_URI[sha256sum] = "6ff1e7fe0c44eb38d2bb0b3cfdf64d931550b350b22dd6e4938ba4c3d43e61c8"
S = "${WORKDIR}/turtlebot3_simulations-release-release-kinetic-turtlebot3_gazebo-0.1.7-0"

inherit catkin
