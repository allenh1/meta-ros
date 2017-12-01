# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Common-Lisp ROS message and service generators."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native genmsg"
SRC_URI = "https://github.com/ros-gbp/${PN}-release/archive/release/lunar/${PN}/0.4.16-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "9f0c659e3cd83548cff404c1f653da7c"
SRC_URI[sha256sum] = "fcdf39b4e33e069f64dc09d655210c1da26ed2fe5de41f6d54a5ccb0ec0673a2"
S = "${WORKDIR}/${PN}-release-release-lunar-${PN}-0.4.16-0"

inherit catkin
