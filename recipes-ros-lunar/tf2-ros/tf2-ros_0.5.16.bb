# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package contains the ROS bindings for the tf2 library, for both Python and "
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib actionlib-msgs catkin-native catkin geometry-msgs message-filters roscpp rosgraph rospy std-msgs tf2 tf2-msgs tf2-py xmlrpcpp"
SRC_URI = "https://github.com/ros-gbp/geometry2-release/archive/release/lunar/tf2_ros/0.5.16-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "c146aa618dbd11115cf0953c04fa59bf"
SRC_URI[sha256sum] = "f229904916fe1848559513e3c5ba32755f9132d11604f384c2441ee6348ac9d7"
S = "${WORKDIR}/geometry2-release-release-lunar-tf2_ros-0.5.16-0"

inherit catkin
