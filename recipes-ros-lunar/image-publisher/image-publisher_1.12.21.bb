# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "None"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "camera-info-manager catkin-native catkin cv-bridge dynamic-reconfigure image-transport nodelet roscpp sensor-msgs"
SRC_URI = "https://github.com/ros-gbp/image_pipeline-release/archive/release/lunar/image_publisher/1.12.21-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "60a4ad6197d24cc8edb823e3d03aede6"
SRC_URI[sha256sum] = "03b0d3b48134fb0a34c848c8e40fe9fc9beec1988fe7ef295f87644c6d002a39"
S = "${WORKDIR}/image_pipeline-release-release-lunar-image_publisher-1.12.21-0"

inherit catkin
