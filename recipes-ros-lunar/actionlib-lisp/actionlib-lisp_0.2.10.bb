# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "actionlib_lisp is a native implementation of the famous actionlib    in Common L"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib-msgs catkin-native cl-utils message-runtime roslisp"
SRC_URI = "https://github.com/ros-gbp/roslisp_common-release/archive/release/lunar/actionlib_lisp/0.2.10-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "14af6358f47ddb3aaff18da5be13059d"
SRC_URI[sha256sum] = "4d8ea2860d1c41ca68647762403b4c42b0a1faf9261a204b1f6d437616403224"
S = "${WORKDIR}/roslisp_common-release-release-lunar-actionlib_lisp-0.2.10-0"

inherit catkin
