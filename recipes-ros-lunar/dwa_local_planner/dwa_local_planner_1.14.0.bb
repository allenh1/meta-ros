# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package provides an implementation of the Dynamic Window Approach to
      "
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=;endline=;md5="

DEPENDS = "base_local_planner catkin cmake_modules costmap_2d dynamic_reconfigure eigen nav_core nav_msgs pcl_conversions pluginlib roscpp tf"
SRC_URI = "https://github.com/ros-gbp/navigation-release/archive/release/lunar/dwa_local_planner/1.14.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "7a15bc262ef277f1ba8d6f6b2ea2a97a"
SRC_URI[sha256sum] = "0dcf8b8d1e45b9b3496b2b031a59ebb7a2c622bc3278f721bd3439dd71f3bf44"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
