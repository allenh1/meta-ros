# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Persistent storage of ROS messages"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "boost catkin-native geometry-msgs pluginlib roscpp rostime std-msgs tf"
SRC_URI = "https://github.com/ros-gbp/warehouse_ros-release/archive/release/kinetic/warehouse_ros/0.9.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "858968febea30295b43eb428803927a6"
SRC_URI[sha256sum] = "5b2103e38a4f57ee000f2b81b3b74238b7f3a44be07ab4e856a60e44d870f281"
S = "${WORKDIR}/warehouse_ros-release-release-kinetic-warehouse_ros-0.9.0-0"

inherit catkin
