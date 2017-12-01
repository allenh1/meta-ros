# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "gazebo_ros_control"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "angles catkin-native control-toolbox controller-manager gazebo-dev gazebo-ros hardware-interface joint-limits-interface pluginlib roscpp std-msgs transmission-interface urdf"
SRC_URI = "https://github.com/ros-gbp/gazebo_ros_pkgs-release/archive/release/lunar/gazebo_ros_control/2.7.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "4270324a2f0e6fffd97dafb700f3ef0e"
SRC_URI[sha256sum] = "7059dc5684c7c8b1e972b1c048d7449acc351425ff748c9f499454412c97aaa1"
S = "${WORKDIR}/gazebo_ros_pkgs-release-release-lunar-gazebo_ros_control-2.7.2-0"

inherit catkin
