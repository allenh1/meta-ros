# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The ur_msgs package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native message-generation message-runtime std-msgs"
SRC_URI = "https://github.com/ros-industrial-release/universal_robot-release/archive/release/kinetic/ur_msgs/1.2.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "d8e2b0301b27471b5ce7fd9497f6078e"
SRC_URI[sha256sum] = "00a00e0e02b72d50a9fba946b349010b2d00fe59b492f83764233fbd06a4d399"
S = "${WORKDIR}/universal_robot-release-release-kinetic-ur_msgs-1.2.0-0"

inherit catkin
