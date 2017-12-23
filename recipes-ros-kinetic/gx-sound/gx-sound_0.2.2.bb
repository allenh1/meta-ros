# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The gx_sound package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native gx-sound-msgs gx-sound-player"
SRC_URI = "https://github.com/groove-x/gx_sound-release/archive/release/kinetic/gx_sound/0.2.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "69b87c2e19827ca79b8d693a1869d1be"
SRC_URI[sha256sum] = "a9d90316e4adb7471d5efbcbbac78fe8c06f804278a7e679a048754c559f0812"
S = "${WORKDIR}/gx_sound-release-release-kinetic-gx_sound-0.2.2-0"

inherit catkin
