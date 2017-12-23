# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "gazebo_ros_control"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "angles catkin-native control-toolbox controller-manager gazebo-dev gazebo-ros hardware-interface joint-limits-interface pluginlib roscpp std-msgs transmission-interface urdf"
SRC_URI = "https://github.com/ros-gbp/gazebo_ros_pkgs-release/archive/release/kinetic/gazebo_ros_control/2.5.14-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "6fcec500cc4726e2ef94edc096919af3"
SRC_URI[sha256sum] = "d1ab5943f207f602c0f0439964007c7536a04a3cc411c06ac5c6f0e59a67cedc"
S = "${WORKDIR}/gazebo_ros_pkgs-release-release-kinetic-gazebo_ros_control-2.5.14-1"

inherit catkin
