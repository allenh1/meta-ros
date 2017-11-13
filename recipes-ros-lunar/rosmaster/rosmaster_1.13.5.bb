# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "ROS  implementation."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native python-defusedxml rosgraph"
SRC_URI = "https://github.com/ros-gbp/ros_comm-release/archive/release/lunar/rosmaster/1.13.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "cb4b02e3f357f78b6eb2c724287ff2c1"
SRC_URI[sha256sum] = "2f67f47777e3a97e361bdb31b75950547560f9d6edf87816f126db8f0f445745"
S = "${WORKDIR}/ros_comm-release-release-lunar-rosmaster-1.13.5-0"

inherit catkin
