# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Interface base class for controllers"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native hardware-interface pluginlib roscpp"
SRC_URI = "https://github.com/ros-gbp/ros_control-release/archive/release/lunar/controller_interface/0.13.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "32707a7dbd6cd5d45a1fc44d4769f5d0"
SRC_URI[sha256sum] = "f11939c6574eb4cf7ba4ec5464253b44dbdcff79bd63493318b90a0d92a06ebb"
S = "${WORKDIR}/ros_control-release-release-lunar-controller_interface-0.13.0-0"

inherit catkin
