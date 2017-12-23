# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "ROS messages for robots using Ackermann steering."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native message-generation message-runtime std-msgs"
SRC_URI = "https://github.com/ros-drivers-gbp/ackermann_msgs-release/archive/release/kinetic/ackermann_msgs/1.0.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "3ca259d62442b6fc6b611ddeba472bac"
SRC_URI[sha256sum] = "18040a0cd20f0fcd40959dacad2fc3f9f72371e3426fe33f4b5fa18f2e53306e"
S = "${WORKDIR}/ackermann_msgs-release-release-kinetic-ackermann_msgs-1.0.1-0"

inherit catkin
