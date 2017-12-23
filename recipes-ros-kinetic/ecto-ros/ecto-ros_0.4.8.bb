# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A set of generic cells to interact with ROS"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native cmake-modules cv-bridge ecto eigen geometry-msgs message-generation message-runtime nav-msgs rosbag roscpp rosmsg sensor-msgs std-msgs"
SRC_URI = "https://github.com/ros-gbp/ecto_ros-release/archive/release/kinetic/ecto_ros/0.4.8-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "d7d98a9d18bc9c8a016773c087a99362"
SRC_URI[sha256sum] = "9dfe52732e3d1fb00d7a23714f5d3d2bdf81904e12757f754a78a79daaf7a5ff"
S = "${WORKDIR}/ecto_ros-release-release-kinetic-ecto_ros-0.4.8-0"

inherit catkin
