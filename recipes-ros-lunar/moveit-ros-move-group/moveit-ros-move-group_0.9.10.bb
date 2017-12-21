# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The move_group node for MoveIt"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib catkin-native moveit-core moveit-kinematics moveit-ros-planning pluginlib std-srvs tf"
SRC_URI = "https://github.com/ros-gbp/moveit-release/archive/release/lunar/moveit_ros_move_group/0.9.10-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "c73335f4b8f8515a76150431dd78c08f"
SRC_URI[sha256sum] = "f6447607cc768b7e10a053184ca26bbc55dc12c351655ad20e46679438da39bc"
S = "${WORKDIR}/moveit-release-release-lunar-moveit_ros_move_group-0.9.10-0"

inherit catkin
