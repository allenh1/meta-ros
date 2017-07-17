# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Package for Nodelet tutorial."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=1;endline=1;md5=f0f5851a35f5b5e7cbe3a00d4454e5e0"

DEPENDS = "catkin nodelet roscpp std_msgs"
SRC_URI = "https://github.com/ros-gbp/common_tutorials-release/archive/release/lunar/nodelet_tutorial_math/0.1.10-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "d2a4a075bb4d626728f4c23c9f4ca364"
SRC_URI[sha256sum] = "2e96b82fe71ce0a9c419f13da0efd38018f146e04f9448d3f5ab23252352895a"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
