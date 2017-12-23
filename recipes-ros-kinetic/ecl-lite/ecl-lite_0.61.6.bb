# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Libraries and utilities for embedded and low-level linux development."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native ecl-config ecl-converters-lite ecl-errors ecl-io ecl-sigslots-lite ecl-time-lite"
SRC_URI = "https://github.com/yujinrobot-release/ecl_lite-release/archive/release/kinetic/ecl_lite/0.61.6-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "85427746224225ea6802949f2e938aea"
SRC_URI[sha256sum] = "05c9749d1f74e10a810b52b0d3b209b22257a84f4a65e6d1cfede0fff412ae5c"
S = "${WORKDIR}/ecl_lite-release-release-kinetic-ecl_lite-0.61.6-0"

inherit catkin
