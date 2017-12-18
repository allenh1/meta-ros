# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Planning components of MoveIt that use ROS"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib angles catkin-native catkin dynamic-reconfigure eigen moveit-core moveit-ros-perception pluginlib"
SRC_URI = "https://github.com/ros-gbp/moveit-release/archive/release/lunar/moveit_ros_planning/0.9.10-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "eedbf9452b187ce870b9150be5e5f735"
SRC_URI[sha256sum] = "0aec93a02fc83829d4ae3b86b581949b678d996c87ef148875ea3228373326b7"
S = "${WORKDIR}/moveit-release-release-lunar-moveit_ros_planning-0.9.10-0"

inherit catkin
