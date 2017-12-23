# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "franka_control provides a hardware node to control a Franka Emika research robot"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "actionlib actionlib-msgs catkin-native controller-interface controller-manager franka-description franka-hw franka-msgs geometry-msgs libfranka message-generation message-runtime pluginlib realtime-tools roscpp sensor-msgs tf tf2-msgs"
SRC_URI = "https://github.com/frankaemika/franka_ros-release/archive/release/kinetic/franka_control/0.1.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "b8a5bb0cdd0bcb72d8c05093c7e5af2e"
SRC_URI[sha256sum] = "3c7946139e00f07a649cb8387167d7af5ee420b4b710cec79efade54bdc1389d"
S = "${WORKDIR}/franka_ros-release-release-kinetic-franka_control-0.1.2-0"

inherit catkin
