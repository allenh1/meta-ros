# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package contains the ROS bindings for the tf2 library, for both Python and "
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib actionlib-msgs catkin-native geometry-msgs message-filters roscpp rosgraph rospy std-msgs tf2 tf2-msgs tf2-py xmlrpcpp"
SRC_URI = "https://github.com/ros-gbp/geometry2-release/archive/release/kinetic/tf2_ros/0.5.16-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "087b5358ad8733c073d6a1d5b8613c6e"
SRC_URI[sha256sum] = "ccd70364f995351940c404c5e1449c2506a27f92ca6b8f6ff84c1faed724c223"
S = "${WORKDIR}/geometry2-release-release-kinetic-tf2_ros-0.5.16-0"

inherit catkin
