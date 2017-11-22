# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The swri_transform_util package contains utility functions and classes for      "
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "boost catkin cv-bridge diagnostic-msgs dynamic-reconfigure geographic-msgs geometry-msgs gps-common libgeos++-dev nodelet proj roscpp rospy sensor-msgs swri-math-util swri-roscpp swri-yaml-util tf topic-tools yaml-cpp"
SRC_URI = "https://github.com/swri-robotics-gbp/marti_common-release/archive/release/lunar/swri_transform_util/1.2.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "a68a2b495412c208d6ba002249a6344e"
SRC_URI[sha256sum] = "8da3c2c27fb215b76945bf1eee06a459a0a4c02fc9396071b5d9873c9cdd264f"
S = "${WORKDIR}/marti_common-release-release-lunar-swri_transform_util-1.2.0-0"

inherit catkin
