# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "move_slow_and_clear"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=01c2bc31767ccb3a68e12f02612b2a97"

DEPENDS = "catkin-native cmake-modules costmap-2d geometry-msgs nav-core pluginlib roscpp"
SRC_URI = "https://github.com/ros-gbp/navigation-release/archive/release/kinetic/move_slow_and_clear/1.14.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "ed976f7203170cf2e86542b0ba0e9815"
SRC_URI[sha256sum] = "1753d647d8e22e47c786d8d0323e8db12c02360f9803dba4bfa801c5928c313c"
S = "${WORKDIR}/navigation-release-release-kinetic-move_slow_and_clear-1.14.2-0"

inherit catkin
