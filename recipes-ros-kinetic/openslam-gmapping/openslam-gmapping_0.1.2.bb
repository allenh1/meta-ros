# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "ROS-ified version of gmapping SLAM. Forked from https://openslam.informatik.uni-"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "CC-BY-SA-3.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=11e24f757f025b2cbebd5b14b4a7ca19"

DEPENDS = "catkin-native"
SRC_URI = "https://github.com/ros-gbp/openslam_gmapping-release/archive/release/kinetic/openslam_gmapping/0.1.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "8473e22505dd4eb1b8c40d1f9a6af76c"
SRC_URI[sha256sum] = "ae4f94bd460677451452569b704640c85a513485031c5e382857ca2b44afe71f"
S = "${WORKDIR}/openslam_gmapping-release-release-kinetic-openslam_gmapping-0.1.2-0"

inherit catkin
