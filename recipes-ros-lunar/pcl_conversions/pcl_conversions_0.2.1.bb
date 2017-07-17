# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Provides conversions from PCL data types and ROS message types"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=1;endline=1;md5=a690b86b964fbaab1b94b9e613be38e7"

DEPENDS = "catkin cmake_modules libpcl-all libpcl-all-dev pcl_msgs roscpp sensor_msgs std_msgs"
SRC_URI = "https://github.com/ros-gbp/pcl_conversions-release/archive/release/lunar/pcl_conversions/0.2.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "11e508e87e700ae9d924c2f736a64939"
SRC_URI[sha256sum] = "6497bedee6e6aa9da2c48458e17a7e47755f75802493598b02fcb42da2006b8d"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
