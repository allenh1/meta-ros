# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Package for all inverse kinematics solvers in MoveIt!"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=16;endline=16;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib catkin-native eigen moveit-core moveit-ros-planning pluginlib"
SRC_URI = "https://github.com/ros-gbp/moveit-release/archive/release/lunar/moveit_kinematics/0.9.10-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "275f7d6ed4e9b0e4fde8eb02e615b190"
SRC_URI[sha256sum] = "ef7df5894f93d8166a709ffaffc6dd3ae2d7c87ef57a3849d92ab374e3d84d01"
S = "${WORKDIR}/moveit-release-release-lunar-moveit_kinematics-0.9.10-0"

inherit catkin
