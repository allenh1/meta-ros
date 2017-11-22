# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Components of MoveIt connecting to MongoDB"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin moveit-ros-planning rosconsole roscpp tf warehouse-ros"
SRC_URI = "https://github.com/ros-gbp/moveit-release/archive/release/lunar/moveit_ros_warehouse/0.9.9-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "7255e67c4c2944891d3380b22d6da432"
SRC_URI[sha256sum] = "72c8b7fd82da76994955d6942deb9a6694cf790400ef7de3a6bd0641d6b0ec91"
S = "${WORKDIR}/moveit-release-release-lunar-moveit_ros_warehouse-0.9.9-0"

inherit catkin
