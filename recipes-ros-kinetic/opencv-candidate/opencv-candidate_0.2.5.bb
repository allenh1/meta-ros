# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Experimental OpenCV functions"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native cv-bridge"
SRC_URI = "https://github.com/ros-gbp/opencv_candidate-release/archive/release/kinetic/opencv_candidate/0.2.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "3926f0d4b7cd03dcd834a8e9fa7aa694"
SRC_URI[sha256sum] = "bea19bc2d54c5a09dc22c301ca24fbb1521c92c14443f72cc64affa68c2ecc27"
S = "${WORKDIR}/opencv_candidate-release-release-kinetic-opencv_candidate-0.2.5-0"

inherit catkin
