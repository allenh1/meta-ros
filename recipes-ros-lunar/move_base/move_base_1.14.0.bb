# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The move_base package provides an implementation of an action (see the  package)"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=;endline=;md5="

DEPENDS = "actionlib base_local_planner catkin clear_costmap_recovery cmake_modules costmap_2d dynamic_reconfigure geometry_msgs message_generation message_runtime move_base_msgs nav_core nav_msgs navfn pluginlib roscpp rospy rotate_recovery std_msgs std_srvs tf visualization_msgs"
SRC_URI = "https://github.com/ros-gbp/navigation-release/archive/release/lunar/move_base/1.14.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "878f9dbf17adba90f8dfe1eb976be01f"
SRC_URI[sha256sum] = "1b8cfbb245b1faaa093b26c9929cfd2fe6f9179f083dabc1b4f91c5b085ff1c2"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
