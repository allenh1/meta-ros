# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Controller for executing joint-space trajectories on a group of joints."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib angles catkin-native cmake-modules control-msgs control-toolbox controller-interface hardware-interface realtime-tools roscpp trajectory-msgs urdf"
SRC_URI = "https://github.com/ros-gbp/ros_controllers-release/archive/release/kinetic/joint_trajectory_controller/0.13.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "3e88e0fadeed4b70c09376d5333e518f"
SRC_URI[sha256sum] = "74d04edb1995743a92896f21e58aae9ed7d708014b145b512d4eb8f06b2fedc1"
S = "${WORKDIR}/ros_controllers-release-release-kinetic-joint_trajectory_controller-0.13.2-0"

inherit catkin
