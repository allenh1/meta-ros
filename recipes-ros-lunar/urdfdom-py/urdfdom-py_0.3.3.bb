# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Python implementation of the URDF parser."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin python python-catkin-pkg python-lxml"
SRC_URI = "https://github.com/ros-gbp/urdfdom_py-release/archive/release/lunar/urdfdom_py/0.3.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "4a673d22a39890c2f6a3bd9fc29d151c"
SRC_URI[sha256sum] = "496915ba03e4fc8a9e0f31f3af016e20f325f53e38ef13df083b4fef5deeaa46"
S = "${WORKDIR}/urdfdom_py-release-release-lunar-urdfdom_py-0.3.3-0"

inherit catkin
