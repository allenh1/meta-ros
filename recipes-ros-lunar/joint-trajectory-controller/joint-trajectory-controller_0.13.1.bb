# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Controller for executing joint-space trajectories on a group of joints."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib angles catkin-native catkin cmake-modules control-msgs control-toolbox controller-interface hardware-interface realtime-tools roscpp trajectory-msgs urdf"
SRC_URI = "https://github.com/ros-gbp/ros_controllers-release/archive/release/lunar/joint_trajectory_controller/0.13.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "33704b3caf045dd455333ed3888b60f7"
SRC_URI[sha256sum] = "d8664563a5c275063041016cdfd8e3174a4095ceafe0c72a24ed2b5139d84a5f"
S = "${WORKDIR}/ros_controllers-release-release-lunar-joint_trajectory_controller-0.13.1-0"

inherit catkin
