# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The nodelet package is designed to provide a way to run multiple     algorithms "
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=16;endline=16;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "bondcpp boost catkin-native cmake-modules message-generation message-runtime pluginlib rosconsole roscpp rospy std-msgs uuid"
SRC_URI = "https://github.com/ros-gbp/nodelet_core-release/archive/release/lunar/nodelet/1.9.13-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "46488d01d6a3d5e26090e512b785afe3"
SRC_URI[sha256sum] = "29473194f7328b98032bfdb75f69a75bc706f70636f286ebf17fd2235aee1e38"
S = "${WORKDIR}/nodelet_core-release-release-lunar-nodelet-1.9.13-0"

inherit catkin
