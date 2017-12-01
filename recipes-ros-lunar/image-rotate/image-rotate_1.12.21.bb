# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "None"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=26;endline=26;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native cmake-modules cv-bridge dynamic-reconfigure geometry-msgs image-transport nodelet roscpp tf2 tf2-geometry-msgs tf2-ros"
SRC_URI = "https://github.com/ros-gbp/image_pipeline-release/archive/release/lunar/image_rotate/1.12.21-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "40b04e1115a7c55a1cc4971b45d26589"
SRC_URI[sha256sum] = "e4bb74e3358ab27baf225d469c569f61aa74d57473bf0b2f18837805eff8b4b0"
S = "${WORKDIR}/image_pipeline-release-release-lunar-image_rotate-1.12.21-0"

inherit catkin
