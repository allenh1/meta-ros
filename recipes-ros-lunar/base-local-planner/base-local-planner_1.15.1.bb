# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package provides implementations of the Trajectory Rollout and Dynamic Wind"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=16;endline=16;md5=01c2bc31767ccb3a68e12f02612b2a97"

DEPENDS = "angles catkin-native cmake-modules costmap-2d dynamic-reconfigure eigen geometry-msgs libpcl-all-dev message-generation message-runtime nav-core nav-msgs pcl-conversions pcl-ros pluginlib rosconsole roscpp rospy std-msgs tf visualization-msgs voxel-grid"
SRC_URI = "https://github.com/ros-gbp/navigation-release/archive/release/lunar/base_local_planner/1.15.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "94bd8d92ced18425fa2c447ce75ad89f"
SRC_URI[sha256sum] = "af0c77d2060befb039a007bb8a2032e356ed3d5d61481a00a37fb5ad37504c72"
S = "${WORKDIR}/navigation-release-release-lunar-base_local_planner-1.15.1-0"

inherit catkin
