# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A generic, simple controller manager plugin for MoveIt."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=1;endline=1;md5=2307067708b71333720f76f2f792a63d"

DEPENDS = "actionlib catkin control_msgs moveit_core pluginlib roscpp"
SRC_URI = "https://github.com/ros-gbp/moveit-release/archive/release/lunar/moveit_simple_controller_manager/0.9.8-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "031dc08ac15e8489967db6c2b3823968"
SRC_URI[sha256sum] = "3efdde21bb7e1c32768c913121c26c11357725ac8633f8d836462b3a7f2c1755"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
