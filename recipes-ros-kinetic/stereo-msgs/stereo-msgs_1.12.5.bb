# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "stereo_msgs contains messages specific to stereo processing, such as disparity i"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native message-generation message-runtime sensor-msgs std-msgs"
SRC_URI = "https://github.com/ros-gbp/common_msgs-release/archive/release/kinetic/stereo_msgs/1.12.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "85bc44bff4be62eeb5e1493ac6ff0f77"
SRC_URI[sha256sum] = "516c0276790ed7a8cd7c2c5ea8a4059072a40ba9cc39772533dad7f32ef29547"
S = "${WORKDIR}/common_msgs-release-release-kinetic-stereo_msgs-1.12.5-0"

inherit catkin
