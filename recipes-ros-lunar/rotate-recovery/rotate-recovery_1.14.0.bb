# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package provides a recovery behavior for the navigation stack that attempts"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=acbed67fd486c51e7a0624505f2e6733"

DEPENDS = "base-local-planner catkin cmake-modules costmap-2d eigen nav-core pluginlib roscpp tf"
SRC_URI = "https://github.com/ros-gbp/navigation-release/archive/release/lunar/rotate_recovery/1.14.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "9e176dd0008bfcee16036b50bd6d9577"
SRC_URI[sha256sum] = "06e84c6cb0cba7492695bbb252787aca50046961bc67e3a58b708d96c970b79c"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
