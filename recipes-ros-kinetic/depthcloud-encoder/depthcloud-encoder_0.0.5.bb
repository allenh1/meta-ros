# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Point Cloud Encoder for Web-Based Streaming"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native cv-bridge image-transport message-filters pcl-conversions pcl-ros roscpp sensor-msgs tf-conversions"
SRC_URI = "https://github.com/RobotWebTools-release/depthcloud_encoder-release/archive/release/kinetic/depthcloud_encoder/0.0.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "660da6b30359c0871a024d5342533f49"
SRC_URI[sha256sum] = "23f696c42c3420f89633db993ea5a135e2f39b89c966fd40ba823b816c33bd8e"
S = "${WORKDIR}/depthcloud_encoder-release-release-kinetic-depthcloud_encoder-0.0.5-0"

inherit catkin
