# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A node to control nonlinear dynamic systems"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native message-generation message-runtime roscpp rospy std-msgs"
SRC_URI = "https://github.com/AndyZe/lyap_control-release/archive/release/kinetic/lyap_control/0.0.13-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "1940c8aac0e659ae3a6f8a30242b220f"
SRC_URI[sha256sum] = "25df3a7baddd2d233d210a24749f2cb69b94f51c6078d37fafda82e933c32aaa"
S = "${WORKDIR}/lyap_control-release-release-kinetic-lyap_control-0.0.13-0"

inherit catkin
