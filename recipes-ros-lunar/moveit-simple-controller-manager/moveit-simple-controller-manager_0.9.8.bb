# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A generic, simple controller manager plugin for MoveIt."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=23f8de2430b349800266ded71351769e"

DEPENDS = "actionlib catkin control-msgs moveit-core pluginlib roscpp"
SRC_URI = "https://github.com/ros-gbp/moveit-release/archive/release/lunar/moveit_simple_controller_manager/0.9.8-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "031dc08ac15e8489967db6c2b3823968"
SRC_URI[sha256sum] = "3efdde21bb7e1c32768c913121c26c11357725ac8633f8d836462b3a7f2c1755"
S = "${WORKDIR}/moveit-release-release-lunar-moveit_simple_controller_manager-0.9.8-0"

inherit catkin
