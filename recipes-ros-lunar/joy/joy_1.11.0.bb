# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "ROS driver for a generic Linux joystick.     The joy package contains joy_node, "
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=4;endline=4;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native diagnostic-updater joystick roscpp sensor-msgs"
SRC_URI = "https://github.com/ros-gbp/${PN}stick_drivers-release/archive/release/lunar/${PN}/1.11.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "7e2b58ed9e9a0fbe7e5dcc2ed152981c"
SRC_URI[sha256sum] = "de1d36789542ae6cd2bb421b6c39fdbf611ed453b5779092e0e3a45eba8251c6"
S = "${WORKDIR}/${PN}stick_drivers-release-release-lunar-${PN}-1.11.0-0"

inherit catkin
