# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The Industrial deprecated package contains nodes, launch files, etc... that are "
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native"
SRC_URI = "https://github.com/ros-industrial-release/industrial_core-release/archive/release/kinetic/industrial_deprecated/0.6.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "3ccb8c102e59282a14cc84387052a33a"
SRC_URI[sha256sum] = "3309399ac154a7202a6ecb12e0b9a545ef6de3c98dea2c11b96060c717c6d53f"
S = "${WORKDIR}/industrial_core-release-release-kinetic-industrial_deprecated-0.6.0-0"

inherit catkin
