# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Contains scripts used by the rosboost-cfg tool for determining cflags/lflags/etc"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native"
SRC_URI = "https://github.com/ros-gbp/ros-release/archive/release/lunar/rosboost_cfg/1.14.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "84ed6a0e81e9a6f4e50e9876a0859510"
SRC_URI[sha256sum] = "ae67d8eb121216aadb56269257909be8b0e995fb3ad700f16b4e18cf5f0bb59c"
S = "${WORKDIR}/ros-release-release-lunar-rosboost_cfg-1.14.2-0"

inherit catkin
