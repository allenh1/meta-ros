# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Contains nodelets for processing depth images such as those      produced by Ope"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "boost catkin-native cmake-modules cv-bridge eigen-conversions image-geometry image-transport message-filters nodelet sensor-msgs stereo-msgs tf2 tf2-ros"
SRC_URI = "https://github.com/ros-gbp/image_pipeline-release/archive/release/kinetic/depth_image_proc/1.12.22-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "65b34dfff71ad7b5621d7f6c91fc2333"
SRC_URI[sha256sum] = "16e71eed788b0f750443fe259b9b96acb623f6a13ab5979f176b59635ce87a2e"
S = "${WORKDIR}/image_pipeline-release-release-kinetic-depth_image_proc-1.12.22-0"

inherit catkin
