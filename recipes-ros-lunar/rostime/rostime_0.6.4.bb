# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Time and Duration implementations for C++ libraries, including roscpp."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "boost catkin-native cpp-common"
SRC_URI = "https://github.com/ros-gbp/roscpp_core-release/archive/release/lunar/rostime/0.6.4-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "ac4e82fca8ef21b5a47554dd81010517"
SRC_URI[sha256sum] = "3b14af20d9108a953b66e2a8264a8f6d07935e997884241f951fb9129900a64d"
S = "${WORKDIR}/roscpp_core-release-release-lunar-rostime-0.6.4-0"

inherit catkin
