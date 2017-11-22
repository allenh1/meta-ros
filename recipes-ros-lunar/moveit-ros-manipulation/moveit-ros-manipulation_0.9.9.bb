# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Components of MoveIt used for manipulation"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib catkin dynamic-reconfigure eigen moveit-core moveit-msgs moveit-ros-move-group moveit-ros-planning pluginlib rosconsole roscpp tf"
SRC_URI = "https://github.com/ros-gbp/moveit-release/archive/release/lunar/moveit_ros_manipulation/0.9.9-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "d41fcb5e5c7cc7d1bc8fec2a3c7d9435"
SRC_URI[sha256sum] = "c8967c92065e4dcfb5af0443a6ea9b4857e8d4238f4036b36206dbefa890160e"
S = "${WORKDIR}/moveit-release-release-lunar-moveit_ros_manipulation-0.9.9-0"

inherit catkin
