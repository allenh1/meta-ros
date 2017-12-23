# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Components of MoveIt that offer visualization"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native eigen geometric-shapes interactive-markers moveit-ros-perception moveit-ros-planning-interface moveit-ros-robot-interaction moveit-ros-warehouse object-recognition-msgs pkgconfig pluginlib roscpp rospy rviz"
SRC_URI = "https://github.com/ros-gbp/moveit-release/archive/release/kinetic/moveit_ros_visualization/0.9.10-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "db72a80fee07572b74f4b55cb98bcb83"
SRC_URI[sha256sum] = "5a9109ae9fe2d021c75bceb168050c99c15576918e4ad1cf952a3d4b696be028"
S = "${WORKDIR}/moveit-release-release-kinetic-moveit_ros_visualization-0.9.10-0"

inherit catkin
