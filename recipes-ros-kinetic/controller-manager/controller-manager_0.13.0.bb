# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The controller manager."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native controller-interface controller-manager-msgs hardware-interface pluginlib realtime-tools"
SRC_URI = "https://github.com/ros-gbp/ros_control-release/archive/release/kinetic/controller_manager/0.13.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "58fd90de4d5f41b1430012c339d2e9e8"
SRC_URI[sha256sum] = "1cb11efb432853cd435ef72e62a3eafa3e5d6e42473807188f5d5ae1a3303ea9"
S = "${WORKDIR}/ros_control-release-release-kinetic-controller_manager-0.13.0-0"

inherit catkin
