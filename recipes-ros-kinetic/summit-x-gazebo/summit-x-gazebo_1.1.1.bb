# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Launch files and world files to start the models in gazebo"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native gazebo-ros roscpp std-msgs std-srvs summit-x-control summit-x-description summit-x-robot-control tf xacro"
SRC_URI = "https://github.com/RobotnikAutomation/summit_x_sim-release/archive/release/kinetic/summit_x_gazebo/1.1.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "bc6a5cc7ba9bddfd4cf247071af52cd1"
SRC_URI[sha256sum] = "27fda900c03da9b4760d4f407002f8c5b8ca3e9bd91a37d7a75e302b37551a79"
S = "${WORKDIR}/summit_x_sim-release-release-kinetic-summit_x_gazebo-1.1.1-0"

inherit catkin
