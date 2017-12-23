# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Contains scripts used by the rosboost-cfg tool for determining cflags/lflags/etc"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native"
SRC_URI = "https://github.com/ros-gbp/ros-release/archive/release/kinetic/rosboost_cfg/1.13.6-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "ce7c62d994a234bc532015d17e412a60"
SRC_URI[sha256sum] = "3495fc265943ecdff11fb5cd50c166f235f24a9f6b79794e30677a5c7ee2ad14"
S = "${WORKDIR}/ros-release-release-kinetic-rosboost_cfg-1.13.6-0"

inherit catkin
