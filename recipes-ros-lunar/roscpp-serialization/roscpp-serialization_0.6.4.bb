# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "roscpp_serialization contains the code for serialization as described in     .  "
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native cpp-common roscpp-traits rostime"
SRC_URI = "https://github.com/ros-gbp/roscpp_core-release/archive/release/lunar/roscpp_serialization/0.6.4-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "59e288f0b378af736991d626a8776b0c"
SRC_URI[sha256sum] = "843ccb3782bf8ced6975d49b3fb1733fcd688069861b46b96e7da3f67de35b7f"
S = "${WORKDIR}/roscpp_core-release-release-lunar-roscpp_serialization-0.6.4-0"

inherit catkin
