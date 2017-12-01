# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Components of MoveIt that offer interaction via interactive markers"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native eigen-conversions interactive-markers moveit-ros-planning pluginlib roscpp tf"
SRC_URI = "https://github.com/ros-gbp/moveit-release/archive/release/lunar/moveit_ros_robot_interaction/0.9.9-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "dc39ad3a54f38a949d33b36d739d2c12"
SRC_URI[sha256sum] = "ba63f527a21f445221ad01c9da6ea32820d52ee248bac9f3e05d016c3f2a7e52"
S = "${WORKDIR}/moveit-release-release-lunar-moveit_ros_robot_interaction-0.9.9-0"

inherit catkin
