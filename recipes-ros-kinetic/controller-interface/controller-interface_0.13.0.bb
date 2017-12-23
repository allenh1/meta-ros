# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Interface base class for controllers"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native hardware-interface pluginlib roscpp"
SRC_URI = "https://github.com/ros-gbp/ros_control-release/archive/release/kinetic/controller_interface/0.13.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "f94d1b4a4d5ec035d41a91d3c1fd7917"
SRC_URI[sha256sum] = "87fe4737eee64d8c3cb480afb518006aa03f58aa3078d6f0b1d26041fe6913bd"
S = "${WORKDIR}/ros_control-release-release-kinetic-controller_interface-0.13.0-0"

inherit catkin
