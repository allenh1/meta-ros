# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "None"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native dynamic-tf-publisher image-view2 jsk-network-tools jsk-tilt-laser jsk-tools jsk-topic-tools multi-map-server virtual-force-publisher"
SRC_URI = "https://github.com/tork-a/jsk_common-release/archive/release/kinetic/jsk_common/2.2.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "b911dee2c9d9660be8244b4d1f6d533d"
SRC_URI[sha256sum] = "b5b353ab8104eb4fbb9291db42d3ebabe4fd819cce0747ea5aa8429fcdb3b5a3"
S = "${WORKDIR}/jsk_common-release-release-kinetic-jsk_common-2.2.5-0"

inherit catkin
