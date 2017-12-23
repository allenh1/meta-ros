# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Rosbridge provides a JSON API to ROS functionality for non-ROS programs.     The"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native rosapi rosbridge-library rosbridge-server"
SRC_URI = "https://github.com/RobotWebTools-release/rosbridge_suite-release/archive/release/kinetic/rosbridge_suite/0.8.6-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "ed5aa45feed3b455035258ef910cabdf"
SRC_URI[sha256sum] = "8a9b11b9d470cb4c0f679eda5cfc2bd2ab4be75843ec77946f6ce2e2f8b27e93"
S = "${WORKDIR}/rosbridge_suite-release-release-kinetic-rosbridge_suite-0.8.6-0"

inherit catkin
