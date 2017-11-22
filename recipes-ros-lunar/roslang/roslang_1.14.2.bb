# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "roslang is a common package that all  depend on.     This is mainly used to find"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin genmsg"
SRC_URI = "https://github.com/ros-gbp/ros-release/archive/release/lunar/roslang/1.14.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "a136c4dd813b31b2eed9911a56aab846"
SRC_URI[sha256sum] = "c94c14fcc5b14a3d6ec72cfc15b868e6fcf48ceb40c0aa3113db18ca2ed9f432"
S = "${WORKDIR}/ros-release-release-lunar-roslang-1.14.2-0"

inherit catkin
