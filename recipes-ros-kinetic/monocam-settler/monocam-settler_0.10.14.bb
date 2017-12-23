# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Listens on a ImageFeatures topic, and waits for the data to settle.      This pa"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib actionlib-msgs catkin-native rosconsole roscpp-serialization settlerlib std-msgs"
SRC_URI = "https://github.com/ros-gbp/calibration-release/archive/release/kinetic/monocam_settler/0.10.14-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "b4250c04abedf434f47a8ad13aee40bb"
SRC_URI[sha256sum] = "8353908c19528a762af7f1651f6b7411a6c55ee2fa8ea3a551f49ed97ed22c8a"
S = "${WORKDIR}/calibration-release-release-kinetic-monocam_settler-0.10.14-0"

inherit catkin
