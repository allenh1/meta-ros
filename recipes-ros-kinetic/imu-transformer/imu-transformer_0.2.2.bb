# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Node/nodelet combination to transform sensor_msgs::Imu data from one frame into "
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "GPL-1"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=162b49cfbae9eadf37c9b89b2d2ac6be"

DEPENDS = "catkin-native geometry-msgs message-filters nodelet roscpp roslaunch sensor-msgs tf tf2 tf2-ros tf2-sensor-msgs topic-tools"
SRC_URI = "https://github.com/ros-gbp/imu_pipeline-release/archive/release/kinetic/imu_transformer/0.2.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "ba2448b988903785a0dd1b4628c9923a"
SRC_URI[sha256sum] = "bdf401a6b4f6ec1625e7389a0778ce90567c6b466a2fccced2452fee657cc5cd"
S = "${WORKDIR}/imu_pipeline-release-release-kinetic-imu_transformer-0.2.2-0"

inherit catkin
