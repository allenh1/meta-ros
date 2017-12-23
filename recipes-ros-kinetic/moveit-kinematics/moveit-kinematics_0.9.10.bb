# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Package for all inverse kinematics solvers in MoveIt!"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=16;endline=16;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib catkin-native eigen moveit-core moveit-ros-planning pluginlib"
SRC_URI = "https://github.com/ros-gbp/moveit-release/archive/release/kinetic/moveit_kinematics/0.9.10-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "384da918eaeb721f11b5627603015504"
SRC_URI[sha256sum] = "21168615b8d90748111c51e6510db3a06d8a291670045ef990d89c23dc387d82"
S = "${WORKDIR}/moveit-release-release-kinetic-moveit_kinematics-0.9.10-0"

inherit catkin
