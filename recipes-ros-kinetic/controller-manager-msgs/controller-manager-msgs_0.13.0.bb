# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Messages and services for the controller manager."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native message-generation message-runtime std-msgs"
SRC_URI = "https://github.com/ros-gbp/ros_control-release/archive/release/kinetic/controller_manager_msgs/0.13.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "f19f9431c2d84d688182de0511c62eca"
SRC_URI[sha256sum] = "c44dd34e15e1c3b660c5038e97dea69a91cbd0bbf00531932ddc33e468e4b17a"
S = "${WORKDIR}/ros_control-release-release-kinetic-controller_manager_msgs-0.13.0-0"

inherit catkin
