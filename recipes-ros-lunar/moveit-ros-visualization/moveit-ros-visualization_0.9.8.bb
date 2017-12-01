# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Components of MoveIt that offer visualization"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native eigen geometric-shapes interactive-markers moveit-ros-perception moveit-ros-planning-interface moveit-ros-robot-interaction moveit-ros-warehouse object-recognition-msgs pkgconfig pluginlib roscpp rospy rviz"
SRC_URI = "https://github.com/ros-gbp/moveit-release/archive/release/lunar/moveit_ros_visualization/0.9.8-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "2df0d881cf59273d3a9d2adeaacb8bd6"
SRC_URI[sha256sum] = "547c0e37c967e566887a5e61e626bb58de62fdc084d32ac0473e0a172dba1758"
S = "${WORKDIR}/moveit-release-release-lunar-moveit_ros_visualization-0.9.8-0"

inherit catkin
