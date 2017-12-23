# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Supporting utilities for ROSflight packages"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native gazebo-msgs geometry-msgs roscpp rosflight-msgs rosgraph-msgs rospy sensor-msgs std-srvs"
SRC_URI = "https://github.com/rosflight/rosflight-release/archive/release/kinetic/rosflight_utils/0.1.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "a252e9886a460911b651424e9e36747a"
SRC_URI[sha256sum] = "63f441a8410f96c6de319e8eaffc485b37a9c20d0027c8e2bca466fd274d17dc"
S = "${WORKDIR}/rosflight-release-release-kinetic-rosflight_utils-0.1.3-0"

inherit catkin
