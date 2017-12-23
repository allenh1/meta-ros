# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The point_cloud_publisher_tutorial package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native roscpp sensor-msgs"
SRC_URI = "https://github.com/ros-gbp/navigation_tutorials-release/archive/release/kinetic/point_cloud_publisher_tutorial/0.2.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "69708c164eb93916ad6c8f666aee8473"
SRC_URI[sha256sum] = "af1414e57e5aff44ff4f97c087c31c2ef4382ec5e691be320c3599512ea54787"
S = "${WORKDIR}/navigation_tutorials-release-release-kinetic-point_cloud_publisher_tutorial-0.2.3-0"

inherit catkin
