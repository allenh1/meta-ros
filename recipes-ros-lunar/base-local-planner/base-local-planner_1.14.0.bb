# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package provides implementations of the Trajectory Rollout and Dynamic Wind"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=01c2bc31767ccb3a68e12f02612b2a97"

DEPENDS = "angles catkin cmake-modules costmap-2d dynamic-reconfigure eigen geometry-msgs message-generation nav-core nav-msgs pcl-conversions pcl-ros pluginlib rosconsole roscpp rospy std-msgs tf visualization-msgs voxel-grid"
SRC_URI = "https://github.com/ros-gbp/navigation-release/archive/release/lunar/base_local_planner/1.14.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "b34b8657b699af53380427ace05e3ede"
SRC_URI[sha256sum] = "8c3978ada988b04ec547aafaf1532bd56104ed7549e974913f6c042c406d4c9a"
S = "${WORKDIR}/navigation-release-release-lunar-base_local_planner-1.14.0-0"

inherit catkin
