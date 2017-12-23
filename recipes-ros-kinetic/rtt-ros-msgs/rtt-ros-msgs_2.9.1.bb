# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package provides .msg and .srv files for use with the rtt_ros_integration p"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native message-generation message-runtime std-msgs"
SRC_URI = "https://github.com/orocos-gbp/rtt_ros_integration-release/archive/release/kinetic/rtt_ros_msgs/2.9.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "74d9e01a631ef058a1e2907352a40b54"
SRC_URI[sha256sum] = "7ec814fe536b7d9ef8c047512987da95e2f019ba4575e95ced0650f7252bc0b5"
S = "${WORKDIR}/rtt_ros_integration-release-release-kinetic-rtt_ros_msgs-2.9.1-0"

inherit catkin
