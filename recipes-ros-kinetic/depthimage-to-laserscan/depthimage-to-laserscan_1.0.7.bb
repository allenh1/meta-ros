# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "depthimage_to_laserscan"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native dynamic-reconfigure gtest image-geometry image-transport nodelet roscpp sensor-msgs"
SRC_URI = "https://github.com/ros-gbp/depthimage_to_laserscan-release/archive/release/kinetic/depthimage_to_laserscan/1.0.7-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "bd98a79071efca19c75de3e3972b6b53"
SRC_URI[sha256sum] = "a5990dab5aa09a34ec03073427930b0fcdd2728cc3ae6be67669d612a26975d2"
S = "${WORKDIR}/depthimage_to_laserscan-release-release-kinetic-depthimage_to_laserscan-1.0.7-0"

inherit catkin
