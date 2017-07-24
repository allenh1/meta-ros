# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package provides a recovery behavior for the navigation stack that attempts"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=01c2bc31767ccb3a68e12f02612b2a97"

DEPENDS = "catkin cmake-modules costmap-2d eigen nav-core pluginlib roscpp tf"
SRC_URI = "https://github.com/ros-gbp/navigation-release/archive/release/lunar/clear_costmap_recovery/1.14.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "99c4b8e4a9e162a64b5e26a96611b382"
SRC_URI[sha256sum] = "1917a05b7287cae796e8a09f270b0b2e86b0ebf1a8f565c80eb8d6f54cfb2068"
S = "${WORKDIR}/navigation-release-release-lunar-clear_costmap_recovery-1.14.0-0"

inherit catkin
