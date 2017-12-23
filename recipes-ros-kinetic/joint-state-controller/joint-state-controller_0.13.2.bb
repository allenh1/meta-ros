# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Controller to publish joint state"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native controller-interface hardware-interface pluginlib realtime-tools roscpp sensor-msgs"
SRC_URI = "https://github.com/ros-gbp/ros_controllers-release/archive/release/kinetic/joint_state_controller/0.13.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "4f80d15d87bb10ea8653268ccdae76ed"
SRC_URI[sha256sum] = "4c04ad6bab9dfaaa7a9b98a8a7f0973c51e08ec5b9fa4f741903113263ad832a"
S = "${WORKDIR}/ros_controllers-release-release-kinetic-joint_state_controller-0.13.2-0"

inherit catkin
