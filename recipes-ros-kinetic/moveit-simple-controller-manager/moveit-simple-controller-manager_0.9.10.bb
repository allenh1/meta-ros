# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A generic, simple controller manager plugin for MoveIt."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib catkin-native control-msgs moveit-core pluginlib roscpp"
SRC_URI = "https://github.com/ros-gbp/moveit-release/archive/release/kinetic/moveit_simple_controller_manager/0.9.10-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "412a30b8e17dc13f156f36dcf00eeb79"
SRC_URI[sha256sum] = "f60583856037b87c26ea239d1a7da4c703f32608bc54e98e629f89ae7ffd47d2"
S = "${WORKDIR}/moveit-release-release-kinetic-moveit_simple_controller_manager-0.9.10-0"

inherit catkin
