# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "C++ implementation of Lie Groups using Eigen."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native cmake eigen"
SRC_URI = "https://github.com/yujinrobot-release/${PN}-release/archive/release/kinetic/${PN}/0.9.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "a10a376183652a80dcb6ffc2c28b19a5"
SRC_URI[sha256sum] = "9cdcd5a6ddc898b2ee5fd6d279d4273c44bde127e74b63edefbfe0a3f795815b"
S = "${WORKDIR}/${PN}-release-release-kinetic-${PN}-0.9.1-0"

inherit catkin
