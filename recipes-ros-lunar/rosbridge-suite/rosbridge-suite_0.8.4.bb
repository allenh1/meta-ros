# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Rosbridge provides a JSON API to ROS functionality for non-ROS programs.     The"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native catkin rosapi rosbridge-library rosbridge-server"
SRC_URI = "https://github.com/RobotWebTools-release/rosbridge_suite-release/archive/release/lunar/rosbridge_suite/0.8.4-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "4e92cfa9adac41c116b0c3de037b6fec"
SRC_URI[sha256sum] = "ba03960ef7b0594903548c8b9a39206c0fb04bf82f315d0a7b7b77306656fe17"
S = "${WORKDIR}/rosbridge_suite-release-release-lunar-rosbridge_suite-0.8.4-0"

inherit catkin
