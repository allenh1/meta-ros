# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "ROS interface for the ROSflight autpilot stack"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native rosflight rosflight-msgs rosflight-utils"
SRC_URI = "https://github.com/rosflight/rosflight-release/archive/release/kinetic/rosflight_pkgs/0.1.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "eaa2359d860a0c50bfbfc40c4ce0b56d"
SRC_URI[sha256sum] = "7b74e6a3c36d0bac5a95d21a4537d23e4670147d5fe5c0a18e7c079106eb344e"
S = "${WORKDIR}/rosflight-release-release-kinetic-rosflight_pkgs-0.1.3-0"

inherit catkin
