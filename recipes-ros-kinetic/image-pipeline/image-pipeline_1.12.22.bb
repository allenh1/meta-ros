# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "image_pipeline fills the gap between getting raw images from a camera driver and"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "camera-calibration catkin-native depth-image-proc image-proc image-publisher image-rotate image-view stereo-image-proc"
SRC_URI = "https://github.com/ros-gbp/image_pipeline-release/archive/release/kinetic/image_pipeline/1.12.22-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "f0c218de4a966f30b4a11f0b27a1f8c5"
SRC_URI[sha256sum] = "d5381af8f75fb5c37f4e13b580c9519541033d98c7e1136daf5eaffb7ae6f38d"
S = "${WORKDIR}/image_pipeline-release-release-kinetic-image_pipeline-1.12.22-0"

inherit catkin
