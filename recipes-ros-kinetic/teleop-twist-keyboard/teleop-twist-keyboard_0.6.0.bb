# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Generic keyboard teleop for twist robots."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native geometry-msgs rospy"
SRC_URI = "https://github.com/ros-gbp/teleop_twist_keyboard-release/archive/release/kinetic/teleop_twist_keyboard/0.6.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "6e582e505158befd88314219ff1a9332"
SRC_URI[sha256sum] = "072004043447a419c62c4592cbd1ce8f90f3d91292e5307f1effcca51e4fac3c"
S = "${WORKDIR}/teleop_twist_keyboard-release-release-kinetic-teleop_twist_keyboard-0.6.0-0"

inherit catkin
