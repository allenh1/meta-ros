# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Common libraries to control ROS based robots. This stack contains     an impleme"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib-lisp catkin-native cl-tf cl-tf2 cl-transforms cl-transforms-stamped cl-urdf cl-utils roslisp-utilities"
SRC_URI = "https://github.com/ros-gbp/roslisp_common-release/archive/release/kinetic/roslisp_common/0.2.10-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "6d3ae08c28b690e4f3981b23eca053eb"
SRC_URI[sha256sum] = "12d03daffc3d3d13471568f9e2edaf467cf0135536e17effb3a11239534ea6e8"
S = "${WORKDIR}/roslisp_common-release-release-kinetic-roslisp_common-0.2.10-0"

inherit catkin
