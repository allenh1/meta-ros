# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "None"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=26;endline=26;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native cmake-modules cv-bridge dynamic-reconfigure geometry-msgs image-transport nodelet roscpp tf2 tf2-geometry-msgs tf2-ros"
SRC_URI = "https://github.com/ros-gbp/image_pipeline-release/archive/release/kinetic/image_rotate/1.12.22-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "b2564a4b183ad240fd0894ddc06faee0"
SRC_URI[sha256sum] = "805f1297ef9c7b0022e69bc966894431cce761f20033b8eaa7cd3012c8070a8d"
S = "${WORKDIR}/image_pipeline-release-release-kinetic-image_rotate-1.12.22-0"

inherit catkin
