# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Provides ROS plugins that offer message and service publishers for interfacing w"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "catkin-native catkin cmake-modules dynamic-reconfigure gazebo-dev gazebo-msgs geometry-msgs roscpp rosgraph-msgs roslib std-msgs std-srvs tf libtinyxml"
SRC_URI = "https://github.com/ros-gbp/gazebo_ros_pkgs-release/archive/release/lunar/gazebo_ros/2.7.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "028629eb4be69f0362d9b9f7aae24ab9"
SRC_URI[sha256sum] = "85b7b58bdc4575553204a25413a9835a881623a36bc77b0deeb0e7c17282f58f"
S = "${WORKDIR}/gazebo_ros_pkgs-release-release-lunar-gazebo_ros-2.7.3-0"

inherit catkin
