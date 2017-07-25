# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Persistent storage of ROS messages"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "boost catkin-native geometry-msgs pluginlib roscpp rostime std-msgs tf"
SRC_URI = "https://github.com/ros-gbp/warehouse_ros-release/archive/release/lunar/warehouse_ros/0.9.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "82346cdd0c760aba2078554ca7ce990c"
SRC_URI[sha256sum] = "a6020d0d1dac8c6e9ee2795df418a2a6a806fda78e195ee5413a1682953847cd"
S = "${WORKDIR}/warehouse_ros-release-release-lunar-warehouse_ros-0.9.0-0"

inherit catkin
