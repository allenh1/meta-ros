# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Client implementation to use TF2 from Common Lisp"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib-lisp catkin-native catkin cl-transforms-stamped cl-utils roslisp tf2-msgs"
SRC_URI = "https://github.com/ros-gbp/roslisp_common-release/archive/release/lunar/cl_tf2/0.2.10-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "8789dbab365e888dfc16a3f51d183ce8"
SRC_URI[sha256sum] = "7d233f75d6b85291bfc92b2193e193bb9834cfa029d0df3d14ff36d5f887968e"
S = "${WORKDIR}/roslisp_common-release-release-lunar-cl_tf2-0.2.10-0"

inherit catkin
