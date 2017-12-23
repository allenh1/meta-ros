# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Provides a cmake config for the default version of Gazebo for the ROS distributi"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "catkin-native gazebo7 libgazebo7-dev"
SRC_URI = "https://github.com/ros-gbp/gazebo_ros_pkgs-release/archive/release/lunar/gazebo_dev/2.7.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "6bbbc85710d7fcc8a5b4a891ad8072c9"
SRC_URI[sha256sum] = "1c26cfef2c4c13897a8a1c8b7295e5a21fe2cd5ff34561e6a986fc5372aa3933"
S = "${WORKDIR}/gazebo_ros_pkgs-release-release-lunar-gazebo_dev-2.7.3-0"

inherit catkin
