# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package provides an implementation of the Dynamic Window Approach to       "
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=22;endline=22;md5=01c2bc31767ccb3a68e12f02612b2a97"

DEPENDS = "base-local-planner catkin cmake-modules costmap-2d dynamic-reconfigure eigen libpcl-all-dev nav-core nav-msgs pcl-conversions pluginlib roscpp tf"
SRC_URI = "https://github.com/ros-gbp/navigation-release/archive/release/lunar/dwa_local_planner/1.15.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "c05d09872d2dbd6a9b8039b3a71cad0d"
SRC_URI[sha256sum] = "1bd96101f30c0775fbc9f837d3633b79af921e488abebc4d611e7fee93be42b9"
S = "${WORKDIR}/navigation-release-release-lunar-dwa_local_planner-1.15.1-0"

inherit catkin
