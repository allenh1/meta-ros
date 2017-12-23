# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Single image rectification and color processing."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "boost catkin-native cv-bridge dynamic-reconfigure image-geometry image-transport nodelet nodelet-topic-tools roscpp sensor-msgs"
SRC_URI = "https://github.com/ros-gbp/image_pipeline-release/archive/release/kinetic/image_proc/1.12.22-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "58b71a10304f1c274c75a15b10aec8bb"
SRC_URI[sha256sum] = "187ab3954f83f43313532f84a1b2965c7c8a1cb058dfcd77cf581cb39a76c69c"
S = "${WORKDIR}/image_pipeline-release-release-kinetic-image_proc-1.12.22-0"

inherit catkin
