# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package provides an RTT plugin to add a ROS node to the RTT process."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native roscpp rtt-ros"
SRC_URI = "https://github.com/orocos-gbp/rtt_ros_integration-release/archive/release/kinetic/rtt_rosnode/2.9.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "1d7eb9c7d310c1d5b856df46156be5c0"
SRC_URI[sha256sum] = "50e67866ba198b1ea3e868d575e325f67c9c95271a207a9eca27cfbce551d5f9"
S = "${WORKDIR}/rtt_ros_integration-release-release-kinetic-rtt_rosnode-2.9.1-0"

inherit catkin
