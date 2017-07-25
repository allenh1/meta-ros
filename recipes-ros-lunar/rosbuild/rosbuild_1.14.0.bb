# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "rosbuild contains scripts for managing the CMake-based build system for ROS."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "python-empy-native message-generation message-runtime pkgconfig catkin-native"
SRC_URI = "https://github.com/ros-gbp/ros-release/archive/release/lunar/rosbuild/1.14.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "2707d28af597c35422f5b9ce639cba53"
SRC_URI[sha256sum] = "4a2cfdab2ff730259be2522c96cd1adffdbd435d51962e3f3a15c1ca5f8183e3"
S = "${WORKDIR}/ros-release-release-lunar-rosbuild-1.14.0-0"

inherit catkin
