# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "multisense_bringup"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native multisense-description multisense-ros"
SRC_URI = "https://github.com/carnegieroboticsllc/multisense_ros-release/archive/release/kinetic/multisense_bringup/4.0.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "3921a8c5ec9e58b77396bbe638e6a685"
SRC_URI[sha256sum] = "8f0fae550f766fe3a38e5acf3e2041322daab141d4b9b663b64bf47a4c02ff85"
S = "${WORKDIR}/multisense_ros-release-release-kinetic-multisense_bringup-4.0.0-0"

inherit catkin
