# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Simple simulation interface and template for setting up a hardware interface for"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib catkin-native cmake-modules control-msgs control-toolbox controller-manager hardware-interface joint-limits-interface libgflags-dev roscpp rosparam-shortcuts sensor-msgs std-msgs trajectory-msgs transmission-interface urdf"
SRC_URI = "https://github.com/davetcoleman/ros_control_boilerplate-release/archive/release/kinetic/ros_control_boilerplate/0.4.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "e7fe4b54d6e731ca5167f2b962a8f1ca"
SRC_URI[sha256sum] = "549a61a022dc82b3c28a2fa180a965a35cf74e171e937a56b0e1466dcd2a679a"
S = "${WORKDIR}/ros_control_boilerplate-release-release-kinetic-ros_control_boilerplate-0.4.1-0"

inherit catkin
