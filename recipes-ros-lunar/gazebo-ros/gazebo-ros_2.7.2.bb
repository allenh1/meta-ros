# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Provides ROS plugins that offer message and service publishers for interfacing w"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "catkin cmake-modules dynamic-reconfigure gazebo-dev gazebo-msgs geometry-msgs roscpp rosgraph-msgs roslib std-msgs std-srvs tf libtinyxml"
SRC_URI = "https://github.com/ros-gbp/gazebo_ros_pkgs-release/archive/release/lunar/gazebo_ros/2.7.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "9e3a7f941d1d292382e220c2fcdbf643"
SRC_URI[sha256sum] = "7ce6a96c5596eea0bdd8373be6f8d0fcb6a035d2c828bed60a8519aad0d4e91f"
S = "${WORKDIR}/gazebo_ros_pkgs-release-release-lunar-gazebo_ros-2.7.2-0"

inherit catkin
