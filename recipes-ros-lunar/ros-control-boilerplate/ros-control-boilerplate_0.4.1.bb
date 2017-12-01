# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Simple simulation interface and template for setting up a hardware interface for"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib catkin-native cmake-modules control-msgs control-toolbox controller-manager hardware-interface joint-limits-interface libgflags-dev roscpp rosparam-shortcuts sensor-msgs std-msgs trajectory-msgs transmission-interface urdf"
SRC_URI = "https://github.com/davetcoleman/ros_control_boilerplate-release/archive/release/lunar/ros_control_boilerplate/0.4.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "557ee03a5d65ac338279964acffb09f4"
SRC_URI[sha256sum] = "2e4ef2732ef09d58c065892bc1cb875e29f1321426b3bcb2fe250b8184fcdf51"
S = "${WORKDIR}/ros_control_boilerplate-release-release-lunar-ros_control_boilerplate-0.4.1-0"

inherit catkin
