# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Tools and utilities for ecl development."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native ecl-build ecl-license"
SRC_URI = "https://github.com/yujinrobot-release/ecl_tools-release/archive/release/kinetic/ecl_tools/0.61.6-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "1de88d8c1198d6ca3d2edfc40de36996"
SRC_URI[sha256sum] = "b89d637a62989fbbf629a285d88fe4b4aee9d984a8a948343fb8968a929f47f2"
S = "${WORKDIR}/ecl_tools-release-release-kinetic-ecl_tools-0.61.6-0"

inherit catkin
