# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Controller to publish joint state"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native controller-interface hardware-interface pluginlib realtime-tools roscpp sensor-msgs"
SRC_URI = "https://github.com/ros-gbp/ros_controllers-release/archive/release/lunar/joint_state_controller/0.13.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "ba668ba7672fed1b6d3519f9eac79859"
SRC_URI[sha256sum] = "d6210a084bee08efa9173e5fce7d959bd66dba5e11a90bd7e93e711aecf4b7a1"
S = "${WORKDIR}/ros_controllers-release-release-lunar-joint_state_controller-0.13.1-0"

inherit catkin
