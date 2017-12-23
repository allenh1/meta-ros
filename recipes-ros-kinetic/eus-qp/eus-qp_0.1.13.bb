# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "eus_qp is an interface of euslisp to solve qp problems with linear constraints."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "catkin-native cmake-modules eigen euslisp rostest"
SRC_URI = "https://github.com/tork-a/jsk_control-release/archive/release/kinetic/eus_qp/0.1.13-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "98fb0f21be2add78386f17bfb15c56a3"
SRC_URI[sha256sum] = "8fef5ac0ff7d095dc51f96d4aa147e4ac46c6e1658af071dc1d16ad54ad17d76"
S = "${WORKDIR}/jsk_control-release-release-kinetic-eus_qp-0.1.13-0"

inherit catkin
