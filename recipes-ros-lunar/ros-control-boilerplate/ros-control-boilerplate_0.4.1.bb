# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Simple simulation interface and template for setting up a hardware interface for"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib catkin cmake-modules control-msgs control-toolbox controller-manager hardware-interface joint-limits-interface libgflags-dev roscpp rosparam-shortcuts sensor-msgs std-msgs trajectory-msgs transmission-interface urdf"
SRC_URI = "https://github.com/davetcoleman/ros_control_boilerplate-release/archive/release/lunar/ros_control_boilerplate/0.4.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "0035a67da3bb343b6e73855357d2449e"
SRC_URI[sha256sum] = "657fff4c225b7650cc1ee7a2ae046d56113253b72175f7c49b5b3ba1485b4be6"
S = "${WORKDIR}/ros_control_boilerplate-release-release-lunar-ros_control_boilerplate-0.4.1-0"

inherit catkin
