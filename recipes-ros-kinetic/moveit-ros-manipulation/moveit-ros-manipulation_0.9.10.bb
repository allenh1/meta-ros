# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Components of MoveIt used for manipulation"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib catkin-native dynamic-reconfigure eigen moveit-core moveit-msgs moveit-ros-move-group moveit-ros-planning pluginlib rosconsole roscpp tf"
SRC_URI = "https://github.com/ros-gbp/moveit-release/archive/release/kinetic/moveit_ros_manipulation/0.9.10-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "5d72725313c0cb1c4e17500d47e01ea3"
SRC_URI[sha256sum] = "8c31af2cca6aa01831e01814c79f30a25fc83be86cc0e4eb7c032ea9212a6fdb"
S = "${WORKDIR}/moveit-release-release-kinetic-moveit_ros_manipulation-0.9.10-0"

inherit catkin
