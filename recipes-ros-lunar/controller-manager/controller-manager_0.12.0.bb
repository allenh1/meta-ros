# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The controller manager."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native controller-interface controller-manager-msgs hardware-interface pluginlib realtime-tools"
SRC_URI = "https://github.com/ros-gbp/ros_control-release/archive/release/lunar/controller_manager/0.12.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "ed533cb52eadf888b7fa86beb1e486d9"
SRC_URI[sha256sum] = "966d534fc42c2cec9a1d856338b98e397f6f83a0b53740f5cd4abcab1b1c2396"
S = "${WORKDIR}/ros_control-release-release-lunar-controller_manager-0.12.0-0"

inherit catkin
