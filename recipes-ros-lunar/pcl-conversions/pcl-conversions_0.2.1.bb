# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Provides conversions from PCL data types and ROS message types"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native cmake-modules libpcl-all libpcl-all-dev pcl-msgs roscpp sensor-msgs std-msgs"
SRC_URI = "https://github.com/ros-gbp/pcl_conversions-release/archive/release/lunar/pcl_conversions/0.2.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "11e508e87e700ae9d924c2f736a64939"
SRC_URI[sha256sum] = "6497bedee6e6aa9da2c48458e17a7e47755f75802493598b02fcb42da2006b8d"
S = "${WORKDIR}/pcl_conversions-release-release-lunar-pcl_conversions-0.2.1-0"

inherit catkin
