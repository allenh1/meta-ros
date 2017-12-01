# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "C++ ROS message and service generators."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native genmsg"
SRC_URI = "https://github.com/ros-gbp/${PN}-release/archive/release/lunar/${PN}/0.5.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "c2a1b03dc0fd212b5dc1b2312e2d5bf3"
SRC_URI[sha256sum] = "6af02ed2a3815c95253c2d2af8b3f7c8619a1c6d34646984dbb1c591b5d6cdf5"
S = "${WORKDIR}/${PN}-release-release-lunar-${PN}-0.5.5-0"

inherit catkin
