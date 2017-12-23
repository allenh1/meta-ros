# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Enhanced tools for benchmarks in MoveIt!"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=16;endline=16;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native moveit-ros-planning moveit-ros-warehouse pluginlib roscpp"
SRC_URI = "https://github.com/ros-gbp/moveit-release/archive/release/kinetic/moveit_ros_benchmarks/0.9.10-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "ec3da32ba5976403551e0a3e7b8570e8"
SRC_URI[sha256sum] = "36c291c2823b43d1413952bbd670bcf813facee180982a33d81d5066fa060e49"
S = "${WORKDIR}/moveit-release-release-kinetic-moveit_ros_benchmarks-0.9.10-0"

inherit catkin
