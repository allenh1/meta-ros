# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Tools and utilities for ecl development."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native catkin ecl-build ecl-license"
SRC_URI = "https://github.com/yujinrobot-release/ecl_tools-release/archive/release/lunar/ecl_tools/0.61.7-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "ff6e3898aa44f720340a6dd408f73009"
SRC_URI[sha256sum] = "c9ccb0127acf14017df267ebfbf14bee81946a0f56d60238281f07210afe2eae"
S = "${WORKDIR}/ecl_tools-release-release-lunar-ecl_tools-0.61.7-0"

inherit catkin
