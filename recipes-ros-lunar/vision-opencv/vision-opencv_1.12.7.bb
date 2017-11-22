# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Packages for interfacing ROS with OpenCV, a library of programming functions for"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin cv-bridge image-geometry"
SRC_URI = "https://github.com/ros-gbp/vision_opencv-release/archive/release/lunar/vision_opencv/1.12.7-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "755079293809c32079b597386df812a0"
SRC_URI[sha256sum] = "0c327d4c3c644094a02e0ea8a9e0f2fd04ee0075c6876549dceea9c28fc0698a"
S = "${WORKDIR}/vision_opencv-release-release-lunar-vision_opencv-1.12.7-0"

inherit catkin
