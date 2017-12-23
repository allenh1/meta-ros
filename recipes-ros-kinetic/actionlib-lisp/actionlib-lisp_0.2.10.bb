# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "actionlib_lisp is a native implementation of the famous actionlib    in Common L"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib-msgs catkin-native cl-utils message-runtime roslisp"
SRC_URI = "https://github.com/ros-gbp/roslisp_common-release/archive/release/kinetic/actionlib_lisp/0.2.10-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "272539add9dfb6c773d68bf6db99948c"
SRC_URI[sha256sum] = "6d9ffe69dbe4239939f00b42cfd20944b4f7705cb6d3f1de999d9350a98a4f5f"
S = "${WORKDIR}/roslisp_common-release-release-kinetic-actionlib_lisp-0.2.10-0"

inherit catkin
