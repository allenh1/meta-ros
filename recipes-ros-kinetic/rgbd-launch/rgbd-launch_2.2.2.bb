# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Launch files to open an RGBD device and load all nodelets to       convert raw d"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native depth-image-proc image-proc nodelet tf2-ros"
SRC_URI = "https://github.com/ros-gbp/rgbd_launch-release/archive/release/kinetic/rgbd_launch/2.2.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "2a0346e337e8f894a9288cb3e763ea3b"
SRC_URI[sha256sum] = "c5a51eacfedf43adc47cbd95156c3aeee110c8a53b40d9e5cac1415830b72dcd"
S = "${WORKDIR}/rgbd_launch-release-release-kinetic-rgbd_launch-2.2.2-0"

inherit catkin
