# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Underlying data libraries for roscpp messages."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native cpp-common roscpp-serialization roscpp-traits rostime"
SRC_URI = "https://github.com/ros-gbp/roscpp_core-release/archive/release/lunar/roscpp_core/0.6.7-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "ed1d2971a08f6bea5258f8cfbd0b5b21"
SRC_URI[sha256sum] = "0b8ace90c95dd4d838112b63a8914da355d75e1e4051e842981cef0765c9b3cb"
S = "${WORKDIR}/roscpp_core-release-release-lunar-roscpp_core-0.6.7-0"

inherit catkin
