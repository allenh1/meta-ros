# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Enhanced tools for benchmarks in MoveIt!"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin moveit-ros-planning moveit-ros-warehouse pluginlib roscpp"
SRC_URI = "https://github.com/ros-gbp/moveit-release/archive/release/lunar/moveit_ros_benchmarks/0.9.9-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "861cdd3647e395e1abd97f02e817493b"
SRC_URI[sha256sum] = "73b6273ab553842fa0644de181599f5e931bc5c0d421bf56e96302f9cbcaf286"
S = "${WORKDIR}/moveit-release-release-lunar-moveit_ros_benchmarks-0.9.9-0"

inherit catkin
