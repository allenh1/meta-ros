# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The Robot Pose EKF package is used to estimate the 3D pose of a robot, based on "
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=01c2bc31767ccb3a68e12f02612b2a97"

DEPENDS = "bfl catkin-native geometry-msgs message-generation message-runtime nav-msgs roscpp sensor-msgs std-msgs tf"
SRC_URI = "https://github.com/ros-gbp/navigation-release/archive/release/kinetic/robot_pose_ekf/1.14.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "3fba9b79c9919c2c9b0f9d5390a8f30f"
SRC_URI[sha256sum] = "6687e1de0dc7745da334d346cdce88acb13c35c48fa15d476b92e83cc890049c"
S = "${WORKDIR}/navigation-release-release-kinetic-robot_pose_ekf-1.14.2-0"

inherit catkin
