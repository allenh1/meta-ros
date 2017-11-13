# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The move_group node for MoveIt"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib catkin-native moveit-core moveit-kinematics moveit-ros-planning pluginlib std-srvs tf"
SRC_URI = "https://github.com/ros-gbp/moveit-release/archive/release/lunar/moveit_ros_move_group/0.9.9-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "3a6fa3a2f3e48d054f9a38ead4bb4452"
SRC_URI[sha256sum] = "b5aa48bd69e8a224fb79ce87baca9210dd8c01cae3853329d187e3c89fb22c5b"
S = "${WORKDIR}/moveit-release-release-lunar-moveit_ros_move_group-0.9.9-0"

inherit catkin
