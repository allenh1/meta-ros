# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package provides implementations of the Trajectory Rollout and Dynamic Wind"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=01c2bc31767ccb3a68e12f02612b2a97"

DEPENDS = "angles catkin-native cmake-modules costmap-2d dynamic-reconfigure eigen geometry-msgs message-generation message-runtime nav-core nav-msgs pcl-conversions pcl-ros pluginlib roscpp rospy std-msgs tf voxel-grid"
SRC_URI = "https://github.com/ros-gbp/navigation-release/archive/release/kinetic/base_local_planner/1.14.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "a5737f24d3020433b67c0618d9339569"
SRC_URI[sha256sum] = "36e7d84a35cbde24e614fc5a46794a5f0450ee39486d830b771d8479c24bcfe2"
S = "${WORKDIR}/navigation-release-release-kinetic-base_local_planner-1.14.2-0"

inherit catkin
