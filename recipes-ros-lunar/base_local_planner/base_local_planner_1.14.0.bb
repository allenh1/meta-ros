# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package provides implementations of the Trajectory Rollout and Dynamic Wind"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=1;endline=1;md5=84bec2f616e741ec6aca5a72ac81d7f4"

DEPENDS = "angles catkin cmake_modules costmap_2d dynamic_reconfigure eigen geometry_msgs message_generation nav_core nav_msgs pcl_conversions pcl_ros pluginlib rosconsole roscpp rospy std_msgs tf visualization_msgs voxel_grid"
SRC_URI = "https://github.com/ros-gbp/navigation-release/archive/release/lunar/base_local_planner/1.14.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "b34b8657b699af53380427ace05e3ede"
SRC_URI[sha256sum] = "8c3978ada988b04ec547aafaf1532bd56104ed7549e974913f6c042c406d4c9a"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
