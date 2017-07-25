# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Common libraries to control ROS based robots. This stack contains     an impleme"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib-lisp catkin-native cl-tf cl-tf2 cl-transforms cl-transforms-stamped cl-urdf cl-utils roslisp-utilities"
SRC_URI = "https://github.com/ros-gbp/roslisp_common-release/archive/release/lunar/roslisp_common/0.2.9-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "011afb8d9d5babe190936ec2e9df2705"
SRC_URI[sha256sum] = "bbb4e1784f0301a5cda20f13dddc06292aac7df366453ea8f0b09ac9eb5cefa7"
S = "${WORKDIR}/roslisp_common-release-release-lunar-roslisp_common-0.2.9-0"

inherit catkin
