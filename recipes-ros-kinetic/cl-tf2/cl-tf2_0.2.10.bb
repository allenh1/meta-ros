# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Client implementation to use TF2 from Common Lisp"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib-lisp catkin-native cl-transforms-stamped cl-utils roslisp tf2-msgs"
SRC_URI = "https://github.com/ros-gbp/roslisp_common-release/archive/release/kinetic/cl_tf2/0.2.10-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "2e25e6b96cbda60f9d851a4894d7dbf1"
SRC_URI[sha256sum] = "1f1c7cc80ac8b3ff1edb65ce0f026f9be9347e9dfbe65423c4bed7f7da36fb41"
S = "${WORKDIR}/roslisp_common-release-release-kinetic-cl_tf2-0.2.10-0"

inherit catkin
