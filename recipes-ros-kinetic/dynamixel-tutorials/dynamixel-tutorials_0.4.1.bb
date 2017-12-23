# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Example configuration and launch file for dynamixel_motor stack."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native dynamixel-controllers"
SRC_URI = "https://github.com/arebgun/dynamixel_motor-release/archive/release/kinetic/dynamixel_tutorials/0.4.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "32b475c344584cfee2e6230d85cc5f1f"
SRC_URI[sha256sum] = "d7b4c362532f2e315ad10d338ec2881476fbf33122e59e31c22eb521842e9afe"
S = "${WORKDIR}/dynamixel_motor-release-release-kinetic-dynamixel_tutorials-0.4.1-0"

inherit catkin
