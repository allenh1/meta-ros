# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "None"
AUTHOR = "OSRF"
SECTION = "devel"
LIC_FILES_CHKSUM = file://package.xml;beginline=13;endline=13;md5=23f8de2430b349800266ded71351769e"

DEPENDS = "catkin eigen geometric_shapes interactive_markers moveit_ros_perception moveit_ros_planning_interface moveit_ros_robot_interaction moveit_ros_warehouse object_recognition_msgs pkg-config pluginlib roscpp rospy rviz"
SRC_URI = "https://github.com/ros-gbp/moveit-release/archive/release/lunar/moveit_ros_visualization/0.9.8-0.tar.gz";downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "2df0d881cf59273d3a9d2adeaacb8bd6"
SRC_URI[sha256sum] = "547c0e37c967e566887a5e61e626bb58de62fdc084d32ac0473e0a172dba1758"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
