# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "franka_hw provides hardware interfaces for using Franka Emika research robots wi"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "catkin-native controller-interface hardware-interface joint-limits-interface libfranka roscpp"
SRC_URI = "https://github.com/frankaemika/franka_ros-release/archive/release/kinetic/franka_hw/0.1.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "42fd1820a1c88f7acf3191078915403a"
SRC_URI[sha256sum] = "a0ec3dd66e6d9782aedc072ec7b4d21afca3779a188cd424d80e870ea6f8da3b"
S = "${WORKDIR}/franka_ros-release-release-kinetic-franka_hw-0.1.2-0"

inherit catkin
