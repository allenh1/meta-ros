# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The move_group node for MoveIt"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib catkin-native moveit-core moveit-kinematics moveit-ros-planning pluginlib std-srvs tf"
SRC_URI = "https://github.com/ros-gbp/moveit-release/archive/release/kinetic/moveit_ros_move_group/0.9.10-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "aabb2989bd2420e438a69288c1a1d8a4"
SRC_URI[sha256sum] = "1d6283f866b6596e7677b1be806cb3426ec99e97da656df8f19dad8f47090a14"
S = "${WORKDIR}/moveit-release-release-kinetic-moveit_ros_move_group-0.9.10-0"

inherit catkin
