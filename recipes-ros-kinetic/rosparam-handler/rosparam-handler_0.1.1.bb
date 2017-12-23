# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "An easy wrapper for using parameters in ROS."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native"
SRC_URI = "https://github.com/cbandera/rosparam_handler-release/archive/release/kinetic/rosparam_handler/0.1.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "3de45fd23d0467dd6a07cf97573ce11f"
SRC_URI[sha256sum] = "7713ba42acac6ca0c8b9379acfcf9315c80c0c9f7ac3c166160b9eec37447ffe"
S = "${WORKDIR}/rosparam_handler-release-release-kinetic-rosparam_handler-0.1.1-0"

inherit catkin
