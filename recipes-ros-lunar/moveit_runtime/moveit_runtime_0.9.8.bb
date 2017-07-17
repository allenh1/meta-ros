# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "moveit_runtime meta package contains MoveIt! packages that are essential for its"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=1;endline=1;md5=24e2d0013490ddddb71f44456568773d"

DEPENDS = "catkin moveit_core moveit_planners moveit_plugins moveit_ros_manipulation moveit_ros_move_group moveit_ros_perception moveit_ros_planning moveit_ros_planning_interface moveit_ros_warehouse"
SRC_URI = "https://github.com/ros-gbp/moveit-release/archive/release/lunar/moveit_runtime/0.9.8-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "47e980fce05ecc3ea6431142d03c9ec2"
SRC_URI[sha256sum] = "9af66d3f7ba2389039d0c4db0d8c3b39dcf65bdfb5e35448840bec256cc957af"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
