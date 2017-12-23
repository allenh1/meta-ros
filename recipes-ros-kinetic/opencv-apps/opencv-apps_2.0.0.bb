# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "None"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=17;endline=17;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native cv-bridge dynamic-reconfigure image-transport message-generation message-runtime nodelet roscpp std-msgs std-srvs"
SRC_URI = "https://github.com/ros-perception/opencv_apps-release/archive/release/kinetic/opencv_apps/2.0.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "f92f0778342fe93d263b12e2bc1de145"
SRC_URI[sha256sum] = "9832eca7901959d7990e91415d9101f37eefd9c69aa91427f07550733e5f2af2"
S = "${WORKDIR}/opencv_apps-release-release-kinetic-opencv_apps-2.0.0-0"

inherit catkin
