# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package contains the components of the rtt_tf package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "GPL-1"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=162b49cfbae9eadf37c9b89b2d2ac6be"

DEPENDS = "catkin-native rtt rtt-geometry-msgs rtt-roscomm tf"
SRC_URI = "https://github.com/orocos-gbp/rtt_ros_integration-release/archive/release/kinetic/rtt_tf/2.9.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "aa8120759b8b5ef5adcfbc037feffdb4"
SRC_URI[sha256sum] = "3041ee21231e6bb722a3551d16c55748166733888161e4d3a1b91346c1d06021"
S = "${WORKDIR}/rtt_ros_integration-release-release-kinetic-rtt_tf-2.9.1-0"

inherit catkin
