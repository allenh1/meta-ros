# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Meta-package for the universal variant library."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "GPL-1"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=146ba316845cfe6058c8baebd902a726"

DEPENDS = "catkin-native variant-msgs variant-topic-test variant-topic-tools"
SRC_URI = "https://github.com/ethz-asl/${PN}-release/archive/release/kinetic/${PN}/0.1.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "c3ebd9e1b863aa4c21b94737245c7261"
SRC_URI[sha256sum] = "f53ab9b175e0c2c9a8b35725307c4beeffe42ea367181dcd7392df6dcee1fddb"
S = "${WORKDIR}/${PN}-release-release-kinetic-${PN}-0.1.3-0"

inherit catkin
