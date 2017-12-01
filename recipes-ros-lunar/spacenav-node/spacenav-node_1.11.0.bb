# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "ROS interface to the 3Dconnexion SpaceNavigator 6DOF joystick."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=4;endline=4;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native geometry-msgs libspnav-dev libx11-dev roscpp sensor-msgs spacenavd"
SRC_URI = "https://github.com/ros-gbp/joystick_drivers-release/archive/release/lunar/spacenav_node/1.11.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "6ab16559cd3a19c921b4ec21315a319e"
SRC_URI[sha256sum] = "de18f475bd78883447fb3e31753909bdfa2be343e6e1bff109b2fafc7334561b"
S = "${WORKDIR}/joystick_drivers-release-release-lunar-spacenav_node-1.11.0-0"

inherit catkin
