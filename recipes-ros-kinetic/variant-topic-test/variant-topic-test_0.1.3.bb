# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Variant topic tools testing suites."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "GPL-1"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=146ba316845cfe6058c8baebd902a726"

DEPENDS = "catkin-native geometry-msgs roscpp std-msgs variant-msgs variant-topic-tools"
SRC_URI = "https://github.com/ethz-asl/variant-release/archive/release/kinetic/variant_topic_test/0.1.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "76045e5fa69c7a1137a522cb55fb5365"
SRC_URI[sha256sum] = "e5321f21d3a297793e090d036d78450d4b7f01d469ca73fa467cc078b0607a5e"
S = "${WORKDIR}/variant-release-release-kinetic-variant_topic_test-0.1.3-0"

inherit catkin
