# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "ROS client nodes for the  library, compatible with VICON, OptiTrack, and other ."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native geometry-msgs roscpp tf2-ros vrpn"
SRC_URI = "https://github.com/ros-drivers-gbp/vrpn_client_ros-release/archive/release/kinetic/vrpn_client_ros/0.2.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "084325c8e4066fb11b9af8751e314295"
SRC_URI[sha256sum] = "247bd32fbc3a0d7350cd0162a94a2c06dbf8dbcdf41b162fc7d6666d003f231a"
S = "${WORKDIR}/vrpn_client_ros-release-release-kinetic-vrpn_client_ros-0.2.2-0"

inherit catkin
