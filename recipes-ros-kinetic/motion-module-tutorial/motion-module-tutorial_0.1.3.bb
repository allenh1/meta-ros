# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The motion_module_tutorial package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native robotis-framework-common roscpp"
SRC_URI = "https://github.com/ROBOTIS-GIT-release/ROBOTIS-THORMANG-MPC-release/archive/release/kinetic/motion_module_tutorial/0.1.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "ce6b3fc23baf343fbb9946e4ef4d23e7"
SRC_URI[sha256sum] = "6c3809abdd817571e8ce0f7ee51db8678ed4b2c0d7c38e86cb6444d1e8aaa25b"
S = "${WORKDIR}/ROBOTIS-THORMANG-MPC-release-release-kinetic-motion_module_tutorial-0.1.3-0"

inherit catkin
