# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "rosbuild contains scripts for managing the CMake-based build system for ROS."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native message-generation message-runtime pkgconfig"
SRC_URI = "https://github.com/ros-gbp/ros-release/archive/release/lunar/rosbuild/1.14.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "a2f70e90c0d6284bb7c8878f942a8625"
SRC_URI[sha256sum] = "ccbc61acbc5244e53374a37247f015eab50b333d888b70c3787a076c090a80b8"
S = "${WORKDIR}/ros-release-release-lunar-rosbuild-1.14.2-0"

inherit catkin
