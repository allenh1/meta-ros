# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "ROS Package Tool"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "boost python-empy-native cmake-modules gtest pkgconfig python python-catkin-pkg-native python-rosdep libtinyxml2"
SRC_URI = "https://github.com/ros-gbp/rospack-release/archive/release/lunar/rospack/2.4.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "dbf4f54bf9c70ca5cf222a4cdcdd1ae4"
SRC_URI[sha256sum] = "f97a5bd428d54d9c4f67279b03625a35b16c77b728e9fd7fd510574384b4965c"
S = "${WORKDIR}/rospack-release-release-lunar-rospack-2.4.1-0"

inherit catkin
