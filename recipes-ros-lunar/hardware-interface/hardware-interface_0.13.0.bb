# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Hardware Interface base class."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native roscpp"
SRC_URI = "https://github.com/ros-gbp/ros_control-release/archive/release/lunar/hardware_interface/0.13.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "c8aa81a50c1b13602a81ff55bba5bb24"
SRC_URI[sha256sum] = "0a36238b493ef1d7c8b63c37868bdcb10c5a63a2f9401682c3450dba19e3b8e0"
S = "${WORKDIR}/ros_control-release-release-lunar-hardware_interface-0.13.0-0"

inherit catkin
