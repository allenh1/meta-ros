# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A fake controller manager plugin for MoveIt."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native catkin moveit-core moveit-ros-planning pluginlib roscpp"
SRC_URI = "https://github.com/ros-gbp/moveit-release/archive/release/lunar/moveit_fake_controller_manager/0.9.10-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "8ac1628779022f82175a092f1d6ccc35"
SRC_URI[sha256sum] = "93274e9ef698f6355250c6959f8ada9329a396687183cb9f80dc008e4e1fd904"
S = "${WORKDIR}/moveit-release-release-lunar-moveit_fake_controller_manager-0.9.10-0"

inherit catkin
