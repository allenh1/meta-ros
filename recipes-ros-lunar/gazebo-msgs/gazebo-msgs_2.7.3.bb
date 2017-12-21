# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Message and service data structures for interacting with Gazebo from ROS."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native geometry-msgs message-generation message-runtime sensor-msgs std-msgs std-srvs trajectory-msgs"
SRC_URI = "https://github.com/ros-gbp/gazebo_ros_pkgs-release/archive/release/lunar/gazebo_msgs/2.7.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "89fae4874e68e42ee629a0511e8eb01d"
SRC_URI[sha256sum] = "1c476daab5db78b888bc3bc8b674c04b21d0fa15149d54fdf8e07a1d2340f02a"
S = "${WORKDIR}/gazebo_ros_pkgs-release-release-lunar-gazebo_msgs-2.7.3-0"

inherit catkin
