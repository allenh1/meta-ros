# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package provides an RTT plugin to add a ROS node to the RTT process,     as"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native libxml2 ocl roslib rospack rostime rtt"
SRC_URI = "https://github.com/orocos-gbp/rtt_ros_integration-release/archive/release/kinetic/rtt_ros/2.9.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "d9dc55aef7e54c7b3096f0d6c17a1982"
SRC_URI[sha256sum] = "a497f365516b0ab256de4149374271e8f9d8a58a57b0912dce952a418db8eede"
S = "${WORKDIR}/rtt_ros_integration-release-release-kinetic-rtt_ros-2.9.1-0"

inherit catkin
