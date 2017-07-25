# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The swri_transform_util package contains utility functions and classes for      "
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "boost catkin-native cv-bridge diagnostic-msgs dynamic-reconfigure geographic-msgs geometry-msgs gps-common libgeos++-dev nodelet pluginlib proj roscpp rospy sensor-msgs swri-math-util swri-roscpp swri-yaml-util tf topic-tools yaml-cpp"
SRC_URI = "https://github.com/swri-robotics-gbp/marti_common-release/archive/release/lunar/swri_transform_util/0.3.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "98a1cb070699b461b9a777b768c32058"
SRC_URI[sha256sum] = "6e5caba809c8b10f715119db8f305f1c93d817756fa5d26928211a6b6273f333"
S = "${WORKDIR}/marti_common-release-release-lunar-swri_transform_util-0.3.0-0"

inherit catkin
