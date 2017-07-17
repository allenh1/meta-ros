# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This planner attempts to find a legal place to put a carrot for the robot to fol"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=;endline=;md5="

DEPENDS = "base_local_planner catkin costmap_2d eigen nav_core pluginlib roscpp tf"
SRC_URI = "https://github.com/ros-gbp/navigation-release/archive/release/lunar/carrot_planner/1.14.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "59d58e65734c47026c8a16b567205ac9"
SRC_URI[sha256sum] = "49f03ef592141e0ea83a18111a7fe944211aa245f6627d94be248c570ae6f1d4"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
