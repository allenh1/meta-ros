# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Components of MoveIt used for manipulation"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=;endline=;md5="

DEPENDS = "actionlib catkin dynamic_reconfigure eigen moveit_core moveit_msgs moveit_ros_move_group moveit_ros_planning pluginlib rosconsole roscpp tf"
SRC_URI = "https://github.com/ros-gbp/moveit-release/archive/release/lunar/moveit_ros_manipulation/0.9.8-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "78d595ec5dc9443ce3648561a4fafad8"
SRC_URI[sha256sum] = "250eb1c55ad6139c24234e92b3daddca5a3d3afc97d089ed575f71b8d37e0d74"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
