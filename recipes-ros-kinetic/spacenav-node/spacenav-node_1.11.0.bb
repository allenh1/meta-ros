# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "ROS interface to the 3Dconnexion SpaceNavigator 6DOF joystick."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=4;endline=4;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native geometry-msgs libspnav-dev libx11-dev roscpp sensor-msgs spacenavd"
SRC_URI = "https://github.com/ros-gbp/joystick_drivers-release/archive/release/kinetic/spacenav_node/1.11.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "731cf84be5219259ddb15a34351e0ea0"
SRC_URI[sha256sum] = "98f108d96f6dd40613f3ab19892397df7a99d8d185f123d0a23803a8099fceeb"
S = "${WORKDIR}/joystick_drivers-release-release-kinetic-spacenav_node-1.11.0-0"

inherit catkin
