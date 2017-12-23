# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Launch files and world files to start the models in gazebo"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native gazebo-ros roscpp std-msgs std-srvs summit-xl-control summit-xl-description summit-xl-robot-control tf xacro"
SRC_URI = "https://github.com/RobotnikAutomation/summit_xl_sim-release/archive/release/kinetic/summit_xl_gazebo/1.0.9-2.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "58b7c061924853eb638910e7f5c256c3"
SRC_URI[sha256sum] = "39c804abbc4cacbc70d37230901c2e79d9a22a24191618650fb44d4a438b17e5"
S = "${WORKDIR}/summit_xl_sim-release-release-kinetic-summit_xl_gazebo-1.0.9-2"

inherit catkin
