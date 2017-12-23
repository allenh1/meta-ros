# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Topic tools for treating messages as variant types."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "GPL-1"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=146ba316845cfe6058c8baebd902a726"

DEPENDS = "catkin-native roscpp roslib variant-msgs"
SRC_URI = "https://github.com/ethz-asl/variant-release/archive/release/kinetic/variant_topic_tools/0.1.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "a2d205347de3972eda112ed6353e3188"
SRC_URI[sha256sum] = "26bb2adc9e71e60f2629c25cacaa6eec6e80cb4b2b6b7698d8d30edf26b0be6e"
S = "${WORKDIR}/variant-release-release-kinetic-variant_topic_tools-0.1.3-0"

inherit catkin
