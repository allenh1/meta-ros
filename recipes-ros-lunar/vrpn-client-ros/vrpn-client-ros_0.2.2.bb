# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "ROS client nodes for the  library, compatible with VICON, OptiTrack, and other ."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native geometry-msgs roscpp tf2-ros vrpn"
SRC_URI = "https://github.com/ros-drivers-gbp/vrpn_client_ros-release/archive/release/lunar/vrpn_client_ros/0.2.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "36f0ee158d02d289b5e3306d2e3a06a1"
SRC_URI[sha256sum] = "df7c36bff4f7e8ec62d172874853616f5c3d53d463a45cb461c3ea09595d343b"
S = "${WORKDIR}/vrpn_client_ros-release-release-lunar-vrpn_client_ros-0.2.2-0"

inherit catkin
