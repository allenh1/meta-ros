# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Components of MoveIt that use ROS"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native moveit-ros-benchmarks moveit-ros-manipulation moveit-ros-move-group moveit-ros-perception moveit-ros-planning moveit-ros-planning-interface moveit-ros-robot-interaction moveit-ros-visualization moveit-ros-warehouse"
SRC_URI = "https://github.com/ros-gbp/moveit-release/archive/release/kinetic/moveit_ros/0.9.10-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "23ad49b964bd803350f0fec464c94f2d"
SRC_URI[sha256sum] = "b4744ae9a87ee07c6950feaa3432ed53d0fb8c99f379d27f67c8bde09309ba55"
S = "${WORKDIR}/moveit-release-release-kinetic-moveit_ros-0.9.10-0"

inherit catkin
