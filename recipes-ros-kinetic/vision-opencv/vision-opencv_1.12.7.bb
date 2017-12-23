# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Packages for interfacing ROS with OpenCV, a library of programming functions for"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native cv-bridge image-geometry"
SRC_URI = "https://github.com/ros-gbp/vision_opencv-release/archive/release/kinetic/vision_opencv/1.12.7-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "dd7e888d547a2e1d9748730e8fcc9816"
SRC_URI[sha256sum] = "5cc6121722479e728f9f80359ec8a53cde7946f4f76e06fc0c35607a4ccb4d6b"
S = "${WORKDIR}/vision_opencv-release-release-kinetic-vision_opencv-1.12.7-0"

inherit catkin
