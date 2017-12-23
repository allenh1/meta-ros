# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "PCL (Point Cloud Library) ROS interface stack. PCL-ROS is the preferred   bridge"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=16;endline=16;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native pcl-conversions pcl-msgs pcl-ros"
SRC_URI = "https://github.com/ros-gbp/perception_pcl-release/archive/release/kinetic/perception_pcl/1.4.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "f222a58971464f2de66d51e1ab4d1a0b"
SRC_URI[sha256sum] = "6aeeae3bdefb24d8f610a9b5f27f6ce8fafd95e8e45fc6ca02c499cedee25857"
S = "${WORKDIR}/perception_pcl-release-release-kinetic-perception_pcl-1.4.1-0"

inherit catkin
