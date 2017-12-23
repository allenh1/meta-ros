# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "tf2_geometry_msgs"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native geometry-msgs orocos-kdl python-orocos-kdl tf2 tf2-ros"
SRC_URI = "https://github.com/ros-gbp/geometry2-release/archive/release/kinetic/tf2_geometry_msgs/0.5.16-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "13e776f37fe8c43e1bab48dda465989c"
SRC_URI[sha256sum] = "ba367e95c95ea9ea06c15f54793cd8601d2c4c85626b51c944ab29d520ceb8d9"
S = "${WORKDIR}/geometry2-release-release-kinetic-tf2_geometry_msgs-0.5.16-0"

inherit catkin
