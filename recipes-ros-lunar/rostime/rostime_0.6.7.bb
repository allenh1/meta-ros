# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Time and Duration implementations for C++ libraries, including roscpp."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "boost catkin-native cpp-common"
SRC_URI = "https://github.com/ros-gbp/roscpp_core-release/archive/release/lunar/rostime/0.6.7-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "5071a20bff01cbce575ef9009d48074d"
SRC_URI[sha256sum] = "bb4b8d406424167c6de4e151c2c597e7b276f32b5954a69e5e08d68ed40a350f"
S = "${WORKDIR}/roscpp_core-release-release-lunar-rostime-0.6.7-0"

inherit catkin
