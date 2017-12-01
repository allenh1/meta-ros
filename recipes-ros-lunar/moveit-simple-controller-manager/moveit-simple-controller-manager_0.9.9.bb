# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A generic, simple controller manager plugin for MoveIt."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib catkin-native control-msgs moveit-core pluginlib roscpp"
SRC_URI = "https://github.com/ros-gbp/moveit-release/archive/release/lunar/moveit_simple_controller_manager/0.9.9-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "b814f091edb5e772a24e95d492247c49"
SRC_URI[sha256sum] = "97bd25de5ede5e8ae91236906ed86447fe229783ea82168f555da2020b4cf687"
S = "${WORKDIR}/moveit-release-release-lunar-moveit_simple_controller_manager-0.9.9-0"

inherit catkin
