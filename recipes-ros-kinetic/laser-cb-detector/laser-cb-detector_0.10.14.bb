# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Extracts checkerboard corners from a dense laser snapshot.      This package is "
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib actionlib-msgs catkin-native cv-bridge image-cb-detector message-filters roscpp settlerlib std-msgs"
SRC_URI = "https://github.com/ros-gbp/calibration-release/archive/release/kinetic/laser_cb_detector/0.10.14-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "55318110a055afcea884a2f7eb9bff40"
SRC_URI[sha256sum] = "26b15d9ddeb6561b5e177589d26635dfa00818578084ee553699660ed8ed4fdb"
S = "${WORKDIR}/calibration-release-release-kinetic-laser_cb_detector-0.10.14-0"

inherit catkin
