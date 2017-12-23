# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Provides a cmake config for the default version of Gazebo for the ROS distributi"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "catkin-native gazebo libgazebo7-dev"
SRC_URI = "https://github.com/ros-gbp/gazebo_ros_pkgs-release/archive/release/kinetic/gazebo_dev/2.5.14-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "ae4ad1a21612548624079a8e8552ed00"
SRC_URI[sha256sum] = "dc608460ff632e2514a33e853ce58b65c4d1b14451901f4bbf482a673aaa4d51"
S = "${WORKDIR}/gazebo_ros_pkgs-release-release-kinetic-gazebo_dev-2.5.14-1"

inherit catkin
