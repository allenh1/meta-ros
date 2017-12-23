# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package provides a recovery behavior for the navigation stack that attempts"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=01c2bc31767ccb3a68e12f02612b2a97"

DEPENDS = "catkin-native cmake-modules costmap-2d eigen nav-core pluginlib roscpp tf"
SRC_URI = "https://github.com/ros-gbp/navigation-release/archive/release/kinetic/clear_costmap_recovery/1.14.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "670df6430d802c0a31aac0703bc15b2e"
SRC_URI[sha256sum] = "ed48ca7182221611ff6992cf3a7ae1f68e83f2c1ce4bdf05cfaa3e587ff30a04"
S = "${WORKDIR}/navigation-release-release-kinetic-clear_costmap_recovery-1.14.2-0"

inherit catkin
