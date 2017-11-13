# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Common Lisp utility libraries"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native sbcl"
SRC_URI = "https://github.com/ros-gbp/roslisp_common-release/archive/release/lunar/cl_utils/0.2.10-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "39489b532f7c39d2d6fa81b4d18cf119"
SRC_URI[sha256sum] = "bb9412d530fea9d634f10af0a6af6f3cc59b2d585e32a16e13f2be74d257caab"
S = "${WORKDIR}/roslisp_common-release-release-lunar-cl_utils-0.2.10-0"

inherit catkin
