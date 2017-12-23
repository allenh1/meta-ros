# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "roscpp_serialization contains the code for serialization as described in     .  "
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native catkin cpp-common roscpp-traits rostime"
SRC_URI = "https://github.com/ros-gbp/roscpp_core-release/archive/release/lunar/roscpp_serialization/0.6.7-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "e0eec9254a5407e4700b7094c693c473"
SRC_URI[sha256sum] = "1ffe2a3e59178ffbf88d71641abf101d0c266eb91dca4b48bcd8a756a1ffbe20"
S = "${WORKDIR}/roscpp_core-release-release-lunar-roscpp_serialization-0.6.7-0"

inherit catkin
