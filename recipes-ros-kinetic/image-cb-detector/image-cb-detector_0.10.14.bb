# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Provide a node that extracts checkerboard corners from ROS images.     This pack"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib actionlib-msgs calibration-msgs catkin-native cv-bridge geometry-msgs image-transport message-filters message-generation message-runtime roscpp sensor-msgs std-msgs"
SRC_URI = "https://github.com/ros-gbp/calibration-release/archive/release/kinetic/image_cb_detector/0.10.14-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "d9bcb4f130b4733e5cc7250a92d29113"
SRC_URI[sha256sum] = "a0151e6621779e4886b5b2a87721d1692375bb3a42defd682ced8175ed043fb8"
S = "${WORKDIR}/calibration-release-release-kinetic-image_cb_detector-0.10.14-0"

inherit catkin
