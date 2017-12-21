# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Components of MoveIt used for manipulation"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib catkin-native dynamic-reconfigure eigen moveit-core moveit-msgs moveit-ros-move-group moveit-ros-planning pluginlib rosconsole roscpp tf"
SRC_URI = "https://github.com/ros-gbp/moveit-release/archive/release/lunar/moveit_ros_manipulation/0.9.10-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "9d9d29c6703f6c4a747505fa22cde241"
SRC_URI[sha256sum] = "248904940c50ed74f73832af053489d297475794510f2e3d468ee9b773bcd953"
S = "${WORKDIR}/moveit-release-release-lunar-moveit_ros_manipulation-0.9.10-0"

inherit catkin
