# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "octomap_ros provides conversion functions between ROS and OctoMap's native types"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native octomap octomap-msgs sensor-msgs tf"
SRC_URI = "https://github.com/ros-gbp/octomap_ros-release/archive/release/kinetic/octomap_ros/0.4.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "3eac4edddbbb8720e28f59d6ac429d76"
SRC_URI[sha256sum] = "fd2a63942add5b97f2d64aa2396931744efc704d4b4aef4465346aa016005544"
S = "${WORKDIR}/octomap_ros-release-release-kinetic-octomap_ros-0.4.0-0"

inherit catkin
