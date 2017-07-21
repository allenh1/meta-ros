# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Components of MoveIt that offer interaction via interactive markers"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=23f8de2430b349800266ded71351769e"

DEPENDS = "catkin eigen-conversions interactive-markers moveit-ros-planning pluginlib roscpp tf"
SRC_URI = "https://github.com/ros-gbp/moveit-release/archive/release/lunar/moveit_ros_robot_interaction/0.9.8-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "2ad1bcf1ff20eedac64e6f2dcb48e85a"
SRC_URI[sha256sum] = "2ad26657f74b0ad5aa6b152fdae4bbf1c7e0771f4c61df33881978b7a1239a4b"
S = "${WORKDIR}/moveit-release-release-lunar-moveit_ros_robot_interaction-0.9.8-0"

inherit catkin
