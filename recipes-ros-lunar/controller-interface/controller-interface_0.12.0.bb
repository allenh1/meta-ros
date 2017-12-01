# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Interface base class for controllers"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native hardware-interface pluginlib roscpp"
SRC_URI = "https://github.com/ros-gbp/ros_control-release/archive/release/lunar/controller_interface/0.12.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "a7463d6412be37390e7862ba3f461632"
SRC_URI[sha256sum] = "793a1f3d104d6e1e2c909dc808b2a42541dd17c844bfa8ca2f434c382bf4f508"
S = "${WORKDIR}/ros_control-release-release-lunar-controller_interface-0.12.0-0"

inherit catkin
