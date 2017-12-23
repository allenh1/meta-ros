# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "cl_urdf"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native cl-transforms roslisp"
SRC_URI = "https://github.com/ros-gbp/roslisp_common-release/archive/release/kinetic/cl_urdf/0.2.10-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "5653dd22f7f1a6033ba13dc450a69430"
SRC_URI[sha256sum] = "735136364a06e0e98bb8a3a93d4dc458778a72b87a095b875e2a79487cfa300d"
S = "${WORKDIR}/roslisp_common-release-release-kinetic-cl_urdf-0.2.10-0"

inherit catkin
