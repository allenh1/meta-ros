# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Components of MoveIt that offer interaction via interactive markers"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native catkin eigen-conversions interactive-markers moveit-ros-planning pluginlib roscpp tf"
SRC_URI = "https://github.com/ros-gbp/moveit-release/archive/release/lunar/moveit_ros_robot_interaction/0.9.10-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "a215ce1ee7a1a78ae1efcf63d33a6d12"
SRC_URI[sha256sum] = "782b9c62e1465bbcf4d719aca90fede75d7d69ab45231be1b52b350abc33a63d"
S = "${WORKDIR}/moveit-release-release-lunar-moveit_ros_robot_interaction-0.9.10-0"

inherit catkin
