# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Generic framework for robot controls."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib catkin-native pluginlib robot-controllers-msgs roscpp"
SRC_URI = "https://github.com/fetchrobotics-gbp/robot_controllers-release/archive/release/kinetic/robot_controllers_interface/0.5.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "9588b69ebd63f3ddf426c0ae510fd5ec"
SRC_URI[sha256sum] = "37bdc1b3cf7957f4c7bd78d10167a51c8f44d887500e4a0936ccb1e7dae18d7e"
S = "${WORKDIR}/robot_controllers-release-release-kinetic-robot_controllers_interface-0.5.2-0"

inherit catkin
