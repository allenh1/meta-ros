# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package provides a recovery behavior for the navigation stack that attempts"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=01c2bc31767ccb3a68e12f02612b2a97"

DEPENDS = "base-local-planner catkin cmake-modules costmap-2d eigen nav-core pluginlib roscpp tf"
SRC_URI = "https://github.com/ros-gbp/navigation-release/archive/release/lunar/rotate_recovery/1.15.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "d044834bb69d0b6bd0cbc07652c60ed9"
SRC_URI[sha256sum] = "b420034e60348a2e32907625950396b21a534fd9493401e5b6fd0da08ad43c82"
S = "${WORKDIR}/navigation-release-release-lunar-rotate_recovery-1.15.1-0"

inherit catkin
