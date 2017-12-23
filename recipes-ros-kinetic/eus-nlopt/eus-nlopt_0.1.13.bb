# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "eus_nlopt"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "catkin-native cmake-modules euslisp nlopt"
SRC_URI = "https://github.com/tork-a/jsk_control-release/archive/release/kinetic/eus_nlopt/0.1.13-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "355ff40dac1cde4ab6a896b848c8aec3"
SRC_URI[sha256sum] = "eeda74a65b195d8395e6f4164149ffeaf0e8a30320eb06ba0e2aa88b0d950e4e"
S = "${WORKDIR}/jsk_control-release-release-kinetic-eus_nlopt-0.1.13-0"

inherit catkin
