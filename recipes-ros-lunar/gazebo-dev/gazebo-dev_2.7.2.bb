# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Provides a cmake config for the default version of Gazebo for the ROS distributi"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "catkin-native gazebo7 libgazebo7-dev"
SRC_URI = "https://github.com/ros-gbp/gazebo_ros_pkgs-release/archive/release/lunar/gazebo_dev/2.7.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "c0ff089197c3347b82d1725a4541e2ab"
SRC_URI[sha256sum] = "09db83f541be65918dbf2dd616285c279a3df86055ce9d855ef19a5bbc30d8ac"
S = "${WORKDIR}/gazebo_ros_pkgs-release-release-lunar-gazebo_dev-2.7.2-0"

inherit catkin
