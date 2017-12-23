# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The gripper_action_controller package"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib angles catkin-native catkin cmake-modules control-msgs control-toolbox controller-interface controller-manager hardware-interface realtime-tools roscpp trajectory-msgs urdf xacro"
SRC_URI = "https://github.com/ros-gbp/ros_controllers-release/archive/release/lunar/gripper_action_controller/0.13.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "d985e20667928b2dca4aa00879b71907"
SRC_URI[sha256sum] = "337d470bf3f9a02760015c92d63ddde78008f70f7f0aa154d48b82aca7c90f4a"
S = "${WORKDIR}/ros_controllers-release-release-lunar-gripper_action_controller-0.13.1-0"

inherit catkin
