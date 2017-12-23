# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package implements the franka gripper of type Franka Hand for the use in ro"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "actionlib actionlib-msgs catkin-native control-msgs libfranka message-generation message-runtime roscpp sensor-msgs xmlrpcpp"
SRC_URI = "https://github.com/frankaemika/franka_ros-release/archive/release/kinetic/franka_gripper/0.1.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "a89a88837270491f320bc087536fad74"
SRC_URI[sha256sum] = "27067e4861467a741c4a385848bcc9a8360f21896e35b45c28479be09a852d8d"
S = "${WORKDIR}/franka_ros-release-release-kinetic-franka_gripper-0.1.2-0"

inherit catkin
