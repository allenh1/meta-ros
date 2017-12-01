# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "forward_command_controller"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native controller-interface hardware-interface realtime-tools std-msgs"
SRC_URI = "https://github.com/ros-gbp/ros_controllers-release/archive/release/lunar/forward_command_controller/0.13.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "57688c3fbb960d1d1eeb88fab28c0b2c"
SRC_URI[sha256sum] = "c5a176682032cdff25041f11278fa849b805d85974d40a3508919ffe1c83eded"
S = "${WORKDIR}/ros_controllers-release-release-lunar-forward_command_controller-0.13.1-0"

inherit catkin
