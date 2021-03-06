# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "image_pipeline fills the gap between getting raw images from a camera driver and"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "camera-calibration catkin-native depth-image-proc image-proc image-publisher image-rotate image-view stereo-image-proc"
SRC_URI = "https://github.com/ros-gbp/image_pipeline-release/archive/release/lunar/image_pipeline/1.12.20-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "34476987e2af126bd09f9e6dbbc50194"
SRC_URI[sha256sum] = "47b21b43d9295c11482ec62ffe9cbb4b27b43fd6c50cba7e6579e430d265083d"
S = "${WORKDIR}/image_pipeline-release-release-lunar-image_pipeline-1.12.20-0"

inherit catkin
