# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package provides an implementation of the Dynamic Window Approach to       "
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=20;endline=20;md5=01c2bc31767ccb3a68e12f02612b2a97"

DEPENDS = "base-local-planner catkin-native cmake-modules costmap-2d dynamic-reconfigure eigen nav-core nav-msgs pcl-conversions pluginlib roscpp tf"
SRC_URI = "https://github.com/ros-gbp/navigation-release/archive/release/kinetic/dwa_local_planner/1.14.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "8ed4ab9dacc464ad0421e52bc1c97bde"
SRC_URI[sha256sum] = "9e5ba3091b957a7ed2cc59efb64a1c3a1f5c792fb23611e3dbe725e8721c6d99"
S = "${WORKDIR}/navigation-release-release-kinetic-dwa_local_planner-1.14.2-0"

inherit catkin
