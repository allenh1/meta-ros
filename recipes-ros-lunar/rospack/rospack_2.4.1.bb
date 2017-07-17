# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "ROS Package Tool"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=1;endline=1;md5=8e61dca98d10d9197c3578ffff9498e2"

DEPENDS = "boost catkin cmake_modules gtest pkg-config python python-catkin-pkg python-rosdep tinyxml2"
SRC_URI = "https://github.com/ros-gbp/rospack-release/archive/release/lunar/rospack/2.4.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "dbf4f54bf9c70ca5cf222a4cdcdd1ae4"
SRC_URI[sha256sum] = "f97a5bd428d54d9c4f67279b03625a35b16c77b728e9fd7fd510574384b4965c"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
