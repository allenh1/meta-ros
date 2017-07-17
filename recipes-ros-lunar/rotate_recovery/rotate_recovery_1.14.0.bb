# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package provides a recovery behavior for the navigation stack that attempts"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=;endline=;md5="

DEPENDS = "base_local_planner catkin cmake_modules costmap_2d eigen nav_core pluginlib roscpp tf"
SRC_URI = "https://github.com/ros-gbp/navigation-release/archive/release/lunar/rotate_recovery/1.14.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "9e176dd0008bfcee16036b50bd6d9577"
SRC_URI[sha256sum] = "06e84c6cb0cba7492695bbb252787aca50046961bc67e3a58b708d96c970b79c"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
