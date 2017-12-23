# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Driver package for Wacohtech dynpick force sensor. This contains -compatible lin"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=16;endline=16;md5=2c00b8d2854109dbebef7818b4dae1e2"

DEPENDS = "catkin-native geometry-msgs python-catkin-pkg-native robot-state-publisher roscpp rviz std-srvs tf xacro"
SRC_URI = "https://github.com/tork-a/dynpick_driver-release/archive/release/kinetic/dynpick_driver/0.2.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "522aea4bd119107adaeb14f8e99cafc2"
SRC_URI[sha256sum] = "3a78a3fd5ab15c800d3f2fddac1e6e8d50c150d8ffb775d656947e7f2cf4f5b4"
S = "${WORKDIR}/dynpick_driver-release-release-kinetic-dynpick_driver-0.2.0-0"

inherit catkin
