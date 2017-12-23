# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Interface for using ROS with the  simulator."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=8caad55b0e7a31e039fbcff07dba789e"

DEPENDS = "catkin-native gazebo-dev gazebo-msgs gazebo-plugins gazebo-ros"
SRC_URI = "https://github.com/ros-gbp/gazebo_ros_pkgs-release/archive/release/kinetic/gazebo_ros_pkgs/2.5.14-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "2d982cd1125d6f88a26d733ef0d82967"
SRC_URI[sha256sum] = "db927575a95874ba62a535e7bdde5fbb2163a67dc2e370fdafdcdcbe66ad99f9"
S = "${WORKDIR}/gazebo_ros_pkgs-release-release-kinetic-gazebo_ros_pkgs-2.5.14-1"

inherit catkin
