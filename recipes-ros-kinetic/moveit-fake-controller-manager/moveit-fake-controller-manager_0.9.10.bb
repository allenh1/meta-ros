# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A fake controller manager plugin for MoveIt."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native moveit-core moveit-ros-planning pluginlib roscpp"
SRC_URI = "https://github.com/ros-gbp/moveit-release/archive/release/kinetic/moveit_fake_controller_manager/0.9.10-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "b1dd6abb0fd4b9d34deaabca9bc22078"
SRC_URI[sha256sum] = "47bcda301f77f8130cadfd6da0f2cb88957bd236cbea9b70a609d0b0d2e37300"
S = "${WORKDIR}/moveit-release-release-kinetic-moveit_fake_controller_manager-0.9.10-0"

inherit catkin
