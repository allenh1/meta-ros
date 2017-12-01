# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "move_slow_and_clear"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=01c2bc31767ccb3a68e12f02612b2a97"

DEPENDS = "catkin-native cmake-modules costmap-2d geometry-msgs nav-core pluginlib roscpp"
SRC_URI = "https://github.com/ros-gbp/navigation-release/archive/release/lunar/move_slow_and_clear/1.15.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "0bf04e10e2cc2b46d1068ae1b36d3a71"
SRC_URI[sha256sum] = "cdf2c15e869bad62fae907cee66e6c773660b906f1efa6d62fd63efb0d4a4f53"
S = "${WORKDIR}/navigation-release-release-lunar-move_slow_and_clear-1.15.1-0"

inherit catkin
