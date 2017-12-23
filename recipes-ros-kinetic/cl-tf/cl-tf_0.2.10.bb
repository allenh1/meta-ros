# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Client implementation to use TF from Common Lisp"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native cl-transforms cl-transforms-stamped roslisp tf"
SRC_URI = "https://github.com/ros-gbp/roslisp_common-release/archive/release/kinetic/cl_tf/0.2.10-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "dd1a535683a0421023816d732f0a9e31"
SRC_URI[sha256sum] = "9ac07c3088ca6e8c62d0b812c1b953a5a8f86f61100bae4845e130097490989e"
S = "${WORKDIR}/roslisp_common-release-release-kinetic-cl_tf-0.2.10-0"

inherit catkin
