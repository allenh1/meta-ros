# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Client implementation to use TF from Common Lisp"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native cl-transforms cl-transforms-stamped roslisp tf"
SRC_URI = "https://github.com/ros-gbp/roslisp_common-release/archive/release/lunar/cl_tf/0.2.10-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "b4432a45c8859b46b075363180a19ab4"
SRC_URI[sha256sum] = "978cd2c2c6dc7c6dc35b1c9f1029e12e78dafc4a95797ed94a566b30809d462f"
S = "${WORKDIR}/roslisp_common-release-release-lunar-cl_tf-0.2.10-0"

inherit catkin
