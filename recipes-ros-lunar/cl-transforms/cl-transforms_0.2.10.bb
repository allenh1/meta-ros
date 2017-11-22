# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Homogeneous transform library for Common Lisp."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin cl-utils sbcl"
SRC_URI = "https://github.com/ros-gbp/roslisp_common-release/archive/release/lunar/cl_transforms/0.2.10-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "707545f2f381a67e9a7b27a150d2da64"
SRC_URI[sha256sum] = "d9a51e544f1ab40c8fa745ea9b1896f511f51466c7b358c3cc06b85c450de7d2"
S = "${WORKDIR}/roslisp_common-release-release-lunar-cl_transforms-0.2.10-0"

inherit catkin
