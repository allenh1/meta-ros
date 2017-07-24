# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "move_slow_and_clear"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=01c2bc31767ccb3a68e12f02612b2a97"

DEPENDS = "catkin cmake-modules costmap-2d geometry-msgs nav-core pluginlib roscpp"
SRC_URI = "https://github.com/ros-gbp/navigation-release/archive/release/lunar/move_slow_and_clear/1.14.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "e64a2dc72f10304a483328ebb6c20ce2"
SRC_URI[sha256sum] = "74cb8c24e19694203b87c48f4ca82bd436554008a6b311d6be831714f9e6201b"
S = "${WORKDIR}/navigation-release-release-lunar-move_slow_and_clear-1.14.0-0"

inherit catkin
