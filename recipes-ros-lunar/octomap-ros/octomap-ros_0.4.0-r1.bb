# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "octomap_ros provides conversion functions between ROS and OctoMap's native types"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native catkin octomap octomap-msgs sensor-msgs tf"
SRC_URI = "https://github.com/ros-gbp/octomap_ros-release/archive/release/lunar/octomap_ros/0.4.0-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "c962c5e06dcc507ebc81f94097bd8493"
SRC_URI[sha256sum] = "edd2478dd7ef3cae39781cd2d8671b1b30d5f5d86bd001f54bd308d093d9541e"
S = "${WORKDIR}/octomap_ros-release-release-lunar-octomap_ros-0.4.0-1"

inherit catkin
