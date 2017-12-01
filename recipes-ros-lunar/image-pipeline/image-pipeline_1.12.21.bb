# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "image_pipeline fills the gap between getting raw images from a camera driver and"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "camera-calibration catkin-native depth-image-proc image-proc image-publisher image-rotate image-view stereo-image-proc"
SRC_URI = "https://github.com/ros-gbp/image_pipeline-release/archive/release/lunar/image_pipeline/1.12.21-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "65a85e712bce682dd05f7544584d2075"
SRC_URI[sha256sum] = "23802c0edf0ef6fac4d9a84f04338dac285537fae54ba66a9d94d57e746744d2"
S = "${WORKDIR}/image_pipeline-release-release-lunar-image_pipeline-1.12.21-0"

inherit catkin
