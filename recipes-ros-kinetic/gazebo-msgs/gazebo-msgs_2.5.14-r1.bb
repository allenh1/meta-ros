# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Message and service data structures for interacting with Gazebo from ROS."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native geometry-msgs message-generation message-runtime sensor-msgs std-msgs std-srvs trajectory-msgs"
SRC_URI = "https://github.com/ros-gbp/gazebo_ros_pkgs-release/archive/release/kinetic/gazebo_msgs/2.5.14-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "47f4e6b802f2561f67e071cca3664171"
SRC_URI[sha256sum] = "8f76ee256b97ab68b4470572282e662ec94a0d3324dfb9093b7a2688c5c61910"
S = "${WORKDIR}/gazebo_ros_pkgs-release-release-kinetic-gazebo_msgs-2.5.14-1"

inherit catkin
