# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Generates a configuration package that makes it easy to use MoveIt!"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native moveit-core moveit-ros-planning moveit-ros-visualization srdfdom xacro yaml-cpp"
SRC_URI = "https://github.com/ros-gbp/moveit-release/archive/release/lunar/moveit_setup_assistant/0.9.9-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "cf914b3f1c557d799caab618be90d710"
SRC_URI[sha256sum] = "553421ac787220633c90be06489dc8e7a8a29517e3afa02c32b83ea5b5b02790"
S = "${WORKDIR}/moveit-release-release-lunar-moveit_setup_assistant-0.9.9-0"

inherit catkin
