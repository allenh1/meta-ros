# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "franka_msgs provides messages specific to Franka Emika research robots"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "catkin-native message-generation message-runtime std-msgs"
SRC_URI = "https://github.com/frankaemika/franka_ros-release/archive/release/kinetic/franka_msgs/0.1.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "ca99ff3db31a59bf4013b91b7656fdf7"
SRC_URI[sha256sum] = "56c766b6fede5dca9e60db4370c73420a77d4c46acd31bae639d92d1d0a8fe85"
S = "${WORKDIR}/franka_ros-release-release-kinetic-franka_msgs-0.1.2-0"

inherit catkin
