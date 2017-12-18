# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "gazebo_ros_control"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "angles catkin-native catkin control-toolbox controller-manager gazebo-dev gazebo-ros hardware-interface joint-limits-interface pluginlib roscpp std-msgs transmission-interface urdf"
SRC_URI = "https://github.com/ros-gbp/gazebo_ros_pkgs-release/archive/release/lunar/gazebo_ros_control/2.7.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "54bd1ce952bcbd26b03b954e79d719f6"
SRC_URI[sha256sum] = "ead9304214c2e686da5b404f65b350cecdbde4c5e1b789c13177f9447784734b"
S = "${WORKDIR}/gazebo_ros_pkgs-release-release-lunar-gazebo_ros_control-2.7.3-0"

inherit catkin
