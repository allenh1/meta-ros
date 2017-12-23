# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Simple Kalman Filter in Python"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native rospy"
SRC_URI = "https://github.com/wu-robotics/wu_ros_tools/archive/release/kinetic/kalman_filter/0.2.4-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "2add438b0db7365f2aaee4454dc24b50"
SRC_URI[sha256sum] = "bb6f05577b69f4d215ad358c43736840b8b5ad26906b6f359ee118e7bb1ac7b7"
S = "${WORKDIR}/wu_ros_tools-release-kinetic-kalman_filter-0.2.4-0"

inherit catkin
