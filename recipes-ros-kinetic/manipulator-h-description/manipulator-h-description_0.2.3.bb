# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The manipulator_h_description package     This package includes URDF model of RO"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native"
SRC_URI = "https://github.com/ROBOTIS-GIT-release/ROBOTIS-MANIPULATOR-H-release/archive/release/kinetic/manipulator_h_description/0.2.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "adf9625670a0939692d3f6bebb39886d"
SRC_URI[sha256sum] = "659969690a19d2912bae68ef68b84a18a09ebe975630943b7b0730a16ae90f90"
S = "${WORKDIR}/ROBOTIS-MANIPULATOR-H-release-release-kinetic-manipulator_h_description-0.2.3-0"

inherit catkin
