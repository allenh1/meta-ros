# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "ROS Package Tool"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "boost catkin-native cmake-modules gtest pkgconfig python python-catkin-pkg-native python-rosdep libtinyxml2"
SRC_URI = "https://github.com/ros-gbp/rospack-release/archive/release/lunar/rospack/2.4.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "4f946c53c6ce4381da3e915d1c096d1c"
SRC_URI[sha256sum] = "c1dca972942e40ffa58018f10dec25a8e33371dfd6350da2485e80fb02bf7046"
S = "${WORKDIR}/rospack-release-release-lunar-rospack-2.4.3-0"

inherit catkin
