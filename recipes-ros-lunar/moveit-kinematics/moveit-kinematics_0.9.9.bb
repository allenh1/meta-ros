# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Package for all inverse kinematics solvers in MoveIt!"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib catkin-native eigen moveit-core moveit-ros-planning pluginlib"
SRC_URI = "https://github.com/ros-gbp/moveit-release/archive/release/lunar/moveit_kinematics/0.9.9-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "3a7da3477871e26ede33f53cb2c224b8"
SRC_URI[sha256sum] = "cb870e302ff44b43296b9e83888233e598704dc5c4fd4c59e52e652b2d827660"
S = "${WORKDIR}/moveit-release-release-lunar-moveit_kinematics-0.9.9-0"

inherit catkin
