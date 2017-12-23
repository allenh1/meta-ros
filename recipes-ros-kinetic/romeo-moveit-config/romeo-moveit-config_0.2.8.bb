# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "An automatically generated package with all the configuration and launch files f"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native joint-state-publisher moveit-fake-controller-manager moveit-planners-ompl moveit-ros-move-group moveit-simple-controller-manager robot-state-publisher romeo-description xacro"
SRC_URI = "https://github.com/ros-aldebaran/romeo_moveit_config-release/archive/release/kinetic/romeo_moveit_config/0.2.8-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "2eefdbcb5faaf0fde4e3fd2f77c6bb9b"
SRC_URI[sha256sum] = "6f6e1d858123b1d8a774d7957e4d07f4e3cb223f6a7bd7262f6cac1304e984a8"
S = "${WORKDIR}/romeo_moveit_config-release-release-kinetic-romeo_moveit_config-0.2.8-0"

inherit catkin
