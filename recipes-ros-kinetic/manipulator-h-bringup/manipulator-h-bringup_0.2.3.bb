# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The manipulator_h_bringup package     This package includes launch file to descr"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native"
SRC_URI = "https://github.com/ROBOTIS-GIT-release/ROBOTIS-MANIPULATOR-H-release/archive/release/kinetic/manipulator_h_bringup/0.2.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "1b2b6bf8031b1ed0792dfcffd2170bf8"
SRC_URI[sha256sum] = "85a408cf56f67e71d6426c3b24f1bae4fb96e7622fa5a26ae36f27de008b56b7"
S = "${WORKDIR}/ROBOTIS-MANIPULATOR-H-release-release-kinetic-manipulator_h_bringup-0.2.3-0"

inherit catkin
