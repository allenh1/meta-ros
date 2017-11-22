# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "ROS client nodes for the  library, compatible with VICON, OptiTrack, and other ."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin geometry-msgs roscpp roslaunch roslint tf2-ros vrpn"
SRC_URI = "https://github.com/ros-drivers-gbp/vrpn_client_ros-release/archive/release/lunar/vrpn_client_ros/0.2.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "46af3cae8da1c51085b08b1c40fc5562"
SRC_URI[sha256sum] = "c6307386b7956e82171ea4209f21d46da71e50eca6d0dd747cd758328c474066"
S = "${WORKDIR}/vrpn_client_ros-release-release-lunar-vrpn_client_ros-0.2.0-0"

inherit catkin
