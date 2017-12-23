# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Provides forward and inverse kinematics for Universal Robots designs.      See h"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "boost catkin-native geometry-msgs moveit-core moveit-kinematics moveit-ros-planning pluginlib roscpp tf-conversions"
SRC_URI = "https://github.com/ros-industrial-release/universal_robot-release/archive/release/kinetic/ur_kinematics/1.2.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "e06eb96d47a7ebead49415cf187ad1de"
SRC_URI[sha256sum] = "465c82951f5826fdee1917c9e5b3cb3d56dec2f6a0fe979c4af336a6c3d411fa"
S = "${WORKDIR}/universal_robot-release-release-kinetic-ur_kinematics-1.2.0-0"

inherit catkin
