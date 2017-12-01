# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package provides a recovery behavior for the navigation stack that attempts"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=01c2bc31767ccb3a68e12f02612b2a97"

DEPENDS = "catkin-native cmake-modules costmap-2d eigen nav-core pluginlib roscpp tf"
SRC_URI = "https://github.com/ros-gbp/navigation-release/archive/release/lunar/clear_costmap_recovery/1.15.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "9c625fca58d37e0d8d37db2885f44d78"
SRC_URI[sha256sum] = "3ed19bf185a49ac39afc14828b4c4c5a7f5399a8aba70009ff41c7e587bb2ed0"
S = "${WORKDIR}/navigation-release-release-lunar-clear_costmap_recovery-1.15.1-0"

inherit catkin
