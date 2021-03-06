# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Package for all inverse kinematics solvers in MoveIt!"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib catkin-native eigen moveit-core moveit-ros-planning pluginlib"
SRC_URI = "https://github.com/ros-gbp/moveit-release/archive/release/lunar/moveit_kinematics/0.9.8-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "05d096ecf1b8f44e4948d773b8f1949e"
SRC_URI[sha256sum] = "42a60aa94fcf015af6d583e29056cc8ce7f45e3ef477fd2c29d9111aff6c039f"
S = "${WORKDIR}/moveit-release-release-lunar-moveit_kinematics-0.9.8-0"

inherit catkin
