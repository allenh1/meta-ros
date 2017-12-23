# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Driver package for Wacohtech dynpick force sensor. This contains -compatible lin"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=16;endline=16;md5=2c00b8d2854109dbebef7818b4dae1e2"

DEPENDS = "catkin-native catkin geometry-msgs python-catkin-pkg-native robot-state-publisher roscpp rviz std-srvs tf xacro"
SRC_URI = "https://github.com/tork-a/dynpick_driver-release/archive/release/lunar/dynpick_driver/0.2.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "5c31d260e6922ebc97173526206eb430"
SRC_URI[sha256sum] = "f590b02b58b7fdeb10f8bb540f214193393d077ee3c650c3acc6f72db5ed0ccf"
S = "${WORKDIR}/dynpick_driver-release-release-lunar-dynpick_driver-0.2.0-0"

inherit catkin
