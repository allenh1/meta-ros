# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Client implementation to use TF2 from Common Lisp"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib-lisp catkin cl-transforms-stamped cl-utils roslisp tf2-msgs"
SRC_URI = "https://github.com/ros-gbp/roslisp_common-release/archive/release/lunar/cl_tf2/0.2.9-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "587025f10a27eae864e8ddeb5b8d1cd9"
SRC_URI[sha256sum] = "ca4480c0c1207ac786de86585a88f754a3402361ae899ffaf779da3a014bd2b4"
S = "${WORKDIR}/roslisp_common-release-release-lunar-cl_tf2-0.2.9-0"

inherit catkin
