# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Homogeneous transform library for Common Lisp."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native cl-utils sbcl"
SRC_URI = "https://github.com/ros-gbp/roslisp_common-release/archive/release/kinetic/cl_transforms/0.2.10-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "09e82172abe46f6d3366980d787d3503"
SRC_URI[sha256sum] = "1d3121eb0dc2b25e11ada5b478ab26f274e905faf28bf2f5a091256ebe084a69"
S = "${WORKDIR}/roslisp_common-release-release-kinetic-cl_transforms-0.2.10-0"

inherit catkin
