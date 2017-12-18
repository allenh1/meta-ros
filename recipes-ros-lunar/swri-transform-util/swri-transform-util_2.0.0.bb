# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The swri_transform_util package contains utility functions and classes for      "
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "boost catkin-native catkin cv-bridge diagnostic-msgs dynamic-reconfigure geographic-msgs geometry-msgs gps-common libgeos++-dev nodelet pkgconfig proj roscpp rospy sensor-msgs swri-math-util swri-roscpp swri-yaml-util tf topic-tools yaml-cpp"
SRC_URI = "https://github.com/swri-robotics-gbp/marti_common-release/archive/release/lunar/swri_transform_util/2.0.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "1883cd9403260dc35fddcc322e9e6253"
SRC_URI[sha256sum] = "e082507d299630ebb37264e161e40b72900644a2458a9356a3e07d7f7027bb97"
S = "${WORKDIR}/marti_common-release-release-lunar-swri_transform_util-2.0.0-0"

inherit catkin
