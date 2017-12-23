# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "multisense_cal_check"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native multisense-ros"
SRC_URI = "https://github.com/carnegieroboticsllc/multisense_ros-release/archive/release/kinetic/multisense_cal_check/4.0.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "eb78d13c0fc5af4342c8651a4eb218bb"
SRC_URI[sha256sum] = "11831d5cdc2747573293a0125b43a8ced218975c56ef1e8506464816dc061ef7"
S = "${WORKDIR}/multisense_ros-release-release-kinetic-multisense_cal_check-4.0.0-0"

inherit catkin
