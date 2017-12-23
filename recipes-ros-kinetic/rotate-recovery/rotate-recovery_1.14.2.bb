# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package provides a recovery behavior for the navigation stack that attempts"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=01c2bc31767ccb3a68e12f02612b2a97"

DEPENDS = "base-local-planner catkin-native cmake-modules costmap-2d eigen nav-core pluginlib roscpp tf"
SRC_URI = "https://github.com/ros-gbp/navigation-release/archive/release/kinetic/rotate_recovery/1.14.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "8cc260a96aaff3b5e96a734c898af0bb"
SRC_URI[sha256sum] = "d058e6b5c2d124238cf57622aa068db9390c02552820e02b83b8014656b6dfc2"
S = "${WORKDIR}/navigation-release-release-kinetic-rotate_recovery-1.14.2-0"

inherit catkin
