# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Components of MoveIt that use ROS"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native moveit-ros-benchmarks moveit-ros-manipulation moveit-ros-move-group moveit-ros-perception moveit-ros-planning moveit-ros-planning-interface moveit-ros-robot-interaction moveit-ros-visualization moveit-ros-warehouse"
SRC_URI = "https://github.com/ros-gbp/moveit-release/archive/release/lunar/moveit_ros/0.9.8-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "c8e7e621aa53ab7d707289782639c50c"
SRC_URI[sha256sum] = "714eec68cf9e3fde5942753c5ac778a05df97d1c040d09a1a45d1c5d24a8e216"
S = "${WORKDIR}/moveit-release-release-lunar-moveit_ros-0.9.8-0"

inherit catkin
