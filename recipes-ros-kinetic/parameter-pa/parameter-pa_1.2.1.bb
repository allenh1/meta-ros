# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "ProAut parameter package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=01c2bc31767ccb3a68e12f02612b2a97"

DEPENDS = "catkin-native cmake-modules eigen message-generation message-runtime roscpp roslib"
SRC_URI = "https://github.com/peterweissig/ros_parameter-release/archive/release/kinetic/parameter_pa/1.2.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "ca47c46ff5d071db294be00e828896d4"
SRC_URI[sha256sum] = "162edff86d570c52e71d78b56a3c076bc91556bd4fba5613f4714f0a65ecaf84"
S = "${WORKDIR}/ros_parameter-release-release-kinetic-parameter_pa-1.2.1-0"

inherit catkin
