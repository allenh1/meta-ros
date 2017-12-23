# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The swri_transform_util package contains utility functions and classes for      "
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "boost catkin-native cv-bridge diagnostic-msgs dynamic-reconfigure geographic-msgs geometry-msgs gps-common libgeos++-dev nodelet pkgconfig proj roscpp rospy sensor-msgs swri-math-util swri-roscpp swri-yaml-util tf topic-tools yaml-cpp"
SRC_URI = "https://github.com/swri-robotics-gbp/marti_common-release/archive/release/kinetic/swri_transform_util/2.0.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "6a3a9ac39f6a6eebacbb8bcad0b7fabb"
SRC_URI[sha256sum] = "71563e4cf7fe428f0965e4289829b9303d4f58f4661046c19b813c85e7778722"
S = "${WORKDIR}/marti_common-release-release-kinetic-swri_transform_util-2.0.0-0"

inherit catkin
