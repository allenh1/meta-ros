# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This planner attempts to find a legal place to put a carrot for the robot to fol"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=16;endline=16;md5=01c2bc31767ccb3a68e12f02612b2a97"

DEPENDS = "base-local-planner catkin-native catkin costmap-2d eigen nav-core pluginlib roscpp tf"
SRC_URI = "https://github.com/ros-gbp/navigation-release/archive/release/lunar/carrot_planner/1.15.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "b38654ad3b9f135e005029ac1d448df7"
SRC_URI[sha256sum] = "b5a0b57fb6b59da3fa68fc9175bd21ba8b3f2e35cc6749fb57cca39074327ea0"
S = "${WORKDIR}/navigation-release-release-lunar-carrot_planner-1.15.1-0"

inherit catkin
