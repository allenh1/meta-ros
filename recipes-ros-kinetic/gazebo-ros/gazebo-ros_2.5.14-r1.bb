# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Provides ROS plugins that offer message and service publishers for interfacing w"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "catkin-native cmake-modules dynamic-reconfigure gazebo-dev gazebo-msgs geometry-msgs roscpp rosgraph-msgs roslib std-msgs std-srvs tf libtinyxml"
SRC_URI = "https://github.com/ros-gbp/gazebo_ros_pkgs-release/archive/release/kinetic/gazebo_ros/2.5.14-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "1629f72c69069916ec74b70f8d1fc8e1"
SRC_URI[sha256sum] = "3fcdfdc2bd190ada621e13747036582a64c1439ddc877181d95f4e5cc1d720b8"
S = "${WORKDIR}/gazebo_ros_pkgs-release-release-kinetic-gazebo_ros-2.5.14-1"

inherit catkin
