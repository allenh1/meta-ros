# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Provides conversions from PCL data types and ROS message types"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native cmake-modules libpcl-all libpcl-all-dev pcl-msgs roscpp sensor-msgs std-msgs"
SRC_URI = "https://github.com/ros-gbp/pcl_conversions-release/archive/release/kinetic/pcl_conversions/0.2.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "bfd5b9e00541f9c26240f38c65d888a6"
SRC_URI[sha256sum] = "6de59a407d381cc9ca253990dfd7cabebee721af1f40952a9d375abb6c943e5a"
S = "${WORKDIR}/pcl_conversions-release-release-kinetic-pcl_conversions-0.2.1-0"

inherit catkin
