# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Controller for executing joint-space trajectories on a group of joints."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib angles catkin-native cmake-modules control-msgs control-toolbox controller-interface hardware-interface realtime-tools roscpp trajectory-msgs urdf"
SRC_URI = "https://github.com/ros-gbp/ros_controllers-release/archive/release/lunar/joint_trajectory_controller/0.12.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "94541d6b7e893bccb9959724bb0da71c"
SRC_URI[sha256sum] = "83007b042850636829b3cdb9e935d6bc05ce163e0fae71a788d97b70c0225842"
S = "${WORKDIR}/ros_controllers-release-release-lunar-joint_trajectory_controller-0.12.3-0"

inherit catkin
