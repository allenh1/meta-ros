# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Components of MoveIt that offer interaction via interactive markers"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native eigen-conversions interactive-markers moveit-ros-planning pluginlib roscpp tf"
SRC_URI = "https://github.com/ros-gbp/moveit-release/archive/release/kinetic/moveit_ros_robot_interaction/0.9.10-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "cfb26a84324cf5a3cd573ae93b5e97dc"
SRC_URI[sha256sum] = "715b12bdcc6815f24eb30c1bcbc33aeecc46b251392782987194db15b2c3d01d"
S = "${WORKDIR}/moveit-release-release-kinetic-moveit_ros_robot_interaction-0.9.10-0"

inherit catkin
