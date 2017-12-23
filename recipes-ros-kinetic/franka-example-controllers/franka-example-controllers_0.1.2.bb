# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The franka_example_controllers package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "catkin-native controller-interface franka-description franka-hw message-generation pluginlib realtime-tools roscpp"
SRC_URI = "https://github.com/frankaemika/franka_ros-release/archive/release/kinetic/franka_example_controllers/0.1.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "d403aa1232f345254ab8b4163c5c1a8c"
SRC_URI[sha256sum] = "5163ef9bc4b7c404870d36e9e4da88d393172d1783f46358e4b8b8429d37b002"
S = "${WORKDIR}/franka_ros-release-release-kinetic-franka_example_controllers-0.1.2-0"

inherit catkin
